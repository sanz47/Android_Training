package com.example.androidtraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout parent;
    private Button btnShowSnack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click=findViewById(R.id.clickBtn);
        Button nxtpg=findViewById(R.id.nxtpg);
        TextView txtMsg=findViewById(R.id.txtMsg);
        btnShowSnack=findViewById(R.id.snackbar);
        parent=findViewById(R.id.parent);
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
        btnShowSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackBAr();
            }
        });
    }
    private void showSnackBAr(){
        Snackbar.make(parent,"Showing Snackbar",Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Retry Clicked",Toast.LENGTH_LONG).show();
                    }
                })
                .setActionTextColor(getColor(R.color.dark_red))
                        .setTextColor(getColor(R.color.yellow))
                        .show();
    }
}