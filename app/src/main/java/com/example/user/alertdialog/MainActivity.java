package com.example.user.alertdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);


    }

    public void ome1(View view) {

        adb=new AlertDialog.Builder(this);

        adb.setTitle("hello");
        adb.setMessage("only text");

        AlertDialog ad=adb.create();
        ad.show();
    }

    public void ome2(View view){

        adb=new AlertDialog.Builder(this);

        adb.setTitle("hello");
        adb.setMessage("only text");

        AlertDialog ad=adb.create();
        ad.show();


    }




}
