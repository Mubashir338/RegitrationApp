package com.example.regitrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/Mubashir338/RegitrationApp");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
    }
}