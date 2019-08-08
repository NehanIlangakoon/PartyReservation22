package com.example.partyreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickChooseAHall(View view){
        startActivity(new Intent(MainActivity.this,HallReservation.class));
    }

    public void OnClickBook(View view){
        startActivity(new Intent(MainActivity.this,ConfirmBooking.class));
    }
}
