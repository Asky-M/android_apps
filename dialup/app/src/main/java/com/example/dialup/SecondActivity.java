package com.example.dialup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tedata = findViewById(R.id.tv_data);

        Intent datainIntent = getIntent();
        String data = datainIntent.getStringExtra("data");

        if (data.equals("")){
            data = "/dev/null | grep 'data kosong'";
        }
        tedata.setText(data);
    }
}
