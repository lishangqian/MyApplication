package com.example.lishangqian.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.AlteredCharSequence;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();

                final View v1 = getLayoutInflater().inflate(R.layout.dhk1,null);
                final EditText userId = (EditText) v1. findViewById(R.id.editTextid);
                final EditText psw = (EditText) v1.findViewById(R.id.editTextpsw);

                builder.setView(v1)//inflater.inflate(R.layout.dhk1,null)
                        .setTitle("登录")

                        .setPositiveButton("login", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,int id){
                                if(userId.getText().toString().equals("abc")&&psw.getText().toString().equals("123")){
                                    Toast.makeText(MainActivity.this, "登陆成功！！", Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(MainActivity.this,"账户或密码错误！！",Toast.LENGTH_LONG).show();}
                            }
                        })

                        .setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id){

                            }
                        });
                builder.show();
            }
        });





        Button out = (Button)findViewById(R.id.out) ;
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("out~")
                        .setTitle("提示");
                builder.show();
            }
        });







        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
