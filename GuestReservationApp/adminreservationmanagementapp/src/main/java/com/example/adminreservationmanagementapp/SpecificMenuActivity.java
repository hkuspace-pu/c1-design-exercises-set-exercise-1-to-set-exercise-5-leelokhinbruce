package com.example.adminreservationmanagementapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.adminreservationmanagementapp.databinding.ActivitySpecificMenuBinding;

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