package com.example.androidtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click=findViewById(R.id.clickBtn);
        TextView txtMsg=findViewById(R.id.txtMsg);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMsg.setText("Good Bye");
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}