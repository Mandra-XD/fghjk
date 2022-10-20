package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText gNum;
    public Button gbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gNum = findViewById(R.id.gNum);

    }
    public void aceptar (View view){
        Toast.makeText(getApplicationContext(), "Elegiste aceptar", Toast.LENGTH_LONG).show();
    }
}