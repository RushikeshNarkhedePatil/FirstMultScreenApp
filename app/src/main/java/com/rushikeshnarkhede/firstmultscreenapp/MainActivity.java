package com.rushikeshnarkhede.firstmultscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    Button btn;
    public static final String EXTRA_NAME = "com.rushikeshnarkhede.firstmultscreenapp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.editTextTextPersonName);
        btn=findViewById(R.id.button);

            }
    public void openActivity(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        ed1 = findViewById(R.id.editTextTextPersonName);
        String nameText = ed1.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText);
        startActivity(intent);
    }
}