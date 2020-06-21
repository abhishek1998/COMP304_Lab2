package com.araturi.abhishekraturi_comp304_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter_SecondScreen(View view) {
        intent = new Intent(this, SecondScreen.class);
        startActivity(intent);
    }
}