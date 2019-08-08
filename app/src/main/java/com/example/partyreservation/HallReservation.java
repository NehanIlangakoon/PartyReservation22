package com.example.partyreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HallReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall_reservation);
    }

    public void OnClickBackToMain(View view){

        startActivity(new Intent(HallReservation.this,MainActivity.class));

    }
}
