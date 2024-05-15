package com.taskmaster.todolist3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Help extends AppCompatActivity {

    ImageButton buttonAboutus;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        buttonAboutus = findViewById(R.id.drawerHelpBtn);
        buttonAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Help.this, Menu.class);
                startActivity(intent);
                //Toast.makeText(Help.this, "Nagana naman siya", Toast.LENGTH_SHORT).show();    //FOR DEBUGGING ONLY
            }
        });
    }
}