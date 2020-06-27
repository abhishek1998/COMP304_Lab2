package com.araturi.abhishekraturi_comp304_lab2;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.house_types_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.type_Apartment :
                intent = new Intent(this, Apartments.class);
                startActivity(intent);
                break;
            case R.id.type_CondominiumHome:
                // list all the houses with type Condominium
                intent = new Intent(this, Condominium.class);
                startActivity(intent);
                break;
            case R.id.type_DetachedHome:
                intent = new Intent(this, DetachedHome.class);
                startActivity(intent);
                break;
            case R.id.type_SemiDetachedHome:
                intent = new Intent(this, SemiDetachedHome.class);
                startActivity(intent);
                break;
            case R.id.type_TownHouse:
                intent = new Intent(this, TownHouse.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
    }
}