package com.example.dialup;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnexplicit = findViewById(R.id.btn_explicit);
        Button btnimplicit = findViewById(R.id.btn_implicit);
        final EditText etInput = findViewById(R.id.kata);
        final EditText etnumber = findViewById(R.id.number);

        btnexplicit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View view){
                String data = etInput.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("data",data);
                startActivity(intent);
            }
        });

        btnimplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomor = etnumber.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + nomor));
                startActivity(intent);
            }
        });
    }
}
