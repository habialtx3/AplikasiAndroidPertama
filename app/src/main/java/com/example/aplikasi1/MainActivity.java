package com.example.aplikasi1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btnOk;
        setContentView(R.layout.activity_main);
        btnOk = (Button) findViewById(R.id.ok);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOk.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "Tombol Menjadi Merah", Toast.LENGTH_SHORT).show();
            }
        });
    }
}