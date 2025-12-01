package com.example.guestreservationapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.guestreservationapp.databinding.ActivitySpecificMenuBinding;

public class SpecificMenuActivity extends AppCompatActivity {
    private ActivitySpecificMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpecificMenuBinding.inflate(getLayoutInflater());  // create a instance of the binding class
        setContentView(binding.getRoot());  // make it the active view on the screen

        Intent intent = getIntent();
        binding.textMenuName.setText(intent.getStringExtra("screen_title"));

        binding.imgBtnBack.setOnClickListener(viewBack -> finish());

    }
}