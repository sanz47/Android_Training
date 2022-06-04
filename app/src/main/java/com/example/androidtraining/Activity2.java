package com.example.androidtraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button goback=findViewById(R.id.go_back);
        CheckBox chkbx1=findViewById(R.id.checkBox);
        CheckBox chkbx2=findViewById(R.id.checkBox2);
        CheckBox chkbx3=findViewById(R.id.checkBox3);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity2.this, "Going Back", Toast.LENGTH_LONG).show();
                Intent goingBack=new Intent(Activity2.this,MainActivity.class);
                startActivity(goingBack);

            }
        });
        chkbx1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(Activity2.this, "Dr.Strange Done", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Activity2.this, "You Need to Watch Dr.Strange", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}