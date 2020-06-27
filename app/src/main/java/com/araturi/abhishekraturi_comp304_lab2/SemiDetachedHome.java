package com.araturi.abhishekraturi_comp304_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SemiDetachedHome extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_detached_home);
    }

    public void enter_PaymentScreen(View view) {
        intent = new Intent(this, Payment.class);
        startActivity(intent);
    }
}