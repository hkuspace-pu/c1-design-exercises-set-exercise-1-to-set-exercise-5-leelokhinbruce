package com.example.guestreservationapp.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.example.guestreservationapp.R;
import com.example.guestreservationapp.databinding.ActivityReservationBinding;
import com.example.guestreservationapp.mainpage.MainActivity;

import java.util.Arrays;
import java.util.List;

public class ReservationActivity extends AppCompatActivity {
    private ActivityReservationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReservationBinding.inflate(getLayoutInflater());  // create a instance of the binding class
        setContentView(binding.getRoot());  // make it the active view on the screen

        // Close Editing Form and back to mainpage
        binding.imgBtnClose.setOnClickListener(viewClose -> {
            Intent intent = new Intent(ReservationActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        binding.btnContinue.setOnClickListener(viewContinue ->
                startActivity(new Intent(ReservationActivity.this, BookingOfferActivity.class)));
    }
}