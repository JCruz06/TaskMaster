package com.taskmaster.todolist3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    private ImageButton menuPage;
    private Button help, exit, home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menuPage = findViewById(R.id.navButton);
        menuPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Menu.this, "WOrking", Toast.LENGTH_SHORT).show();  //FOR DEBUGGING ONLY
                finish();
            }
        });

        help = findViewById(R.id.help_button);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Help.class);
                //Toast.makeText(Menu.this, "Yes nagana", Toast.LENGTH_SHORT).show();       //FOR DEBUGGING ONLY
                startActivity(intent);
            }
        });

        home = findViewById(R.id.homeBtn);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
                //Toast.makeText(Menu.this, "Home to", Toast.LENGTH_SHORT).show();      //FOR DEBUGGING ONLY
            }
        });


    }
}