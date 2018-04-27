package com.harsha.internetspeedtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn3=(Button)findViewById(R.id.btn3);
    }

    public void click3(View view){


        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);

    }

}
