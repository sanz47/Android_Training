package com.example.androidtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Button nxtpg=findViewById(R.id.nxtpg);
        TextView txtMsg=findViewById(R.id.txtMsg);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMsg.setText("Good Bye");
            }
        });
        nxtpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Going to Next Page", Toast.LENGTH_SHORT).show();
                Intent nxtPage=new Intent(MainActivity.this,Activity2.class);
                startActivity(nxtPage);
            }
        });
    }
}