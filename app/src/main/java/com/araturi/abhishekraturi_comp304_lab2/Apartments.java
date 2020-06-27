package com.araturi.abhishekraturi_comp304_lab2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import static android.app.PendingIntent.getActivity;
public class Apartments extends AppCompatActivity {
    Intent intent;
    public static double TOTAL_PRICE = 0.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartments);
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat("TotalPrice", 10000.0f );
        editor.commit();
    }

    public void enter_PaymentScreen(View view) {
        intent = new Intent(this,Payment.class);
        startActivity(intent);
    }

    public void onApartmentSelected(View view) {
        switch(view.getId()) {
            case R.id.apartment_1:
                TOTAL_PRICE += Prices.getPrice(1);
                break;
            case R.id.apartment_2:
                TOTAL_PRICE += Prices.getPrice(2);
                break;
            case R.id.apartment_3:
                TOTAL_PRICE += Prices.getPrice(3);
                break;
            case R.id.apartment_4:
                TOTAL_PRICE += Prices.getPrice(4);
                break;
            case R.id.apartment_5:
                TOTAL_PRICE += Prices.getPrice(5);
                break;
            case R.id.apartment_6:
                TOTAL_PRICE += Prices.getPrice(6);
                break;
            default:
                break;
        }
        Log.d("Apartment TotalPrice" , " "+ TOTAL_PRICE);
    }
}