package com.araturi.abhishekraturi_comp304_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.widget.EditText;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        float price = sharedPref.getFloat("TotalPrice",0.0f);

        EditText totalPrice = (EditText) findViewById(R.id.TotalPrice);
        totalPrice.setText(String.format(" $%s", price));
        Log.d("Payment", " TotalPrice " + price);
    }
}