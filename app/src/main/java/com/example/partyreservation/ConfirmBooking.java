package com.example.partyreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmBooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_booking);
    }

    public void OnClickMainBackToMain(View view){

        startActivity(new Intent(ConfirmBooking.this,MainActivity.class));
    }
}
