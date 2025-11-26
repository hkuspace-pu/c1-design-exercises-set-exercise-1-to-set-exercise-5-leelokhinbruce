package com.example.guestreservationapp.reservation;

import android.os.Bundle;
import android.util.Pair;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;

import com.example.guestreservationapp.R;
import com.example.guestreservationapp.databinding.ActivityReservationBinding;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ReservationActivity extends AppCompatActivity {
    private ActivityReservationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReservationBinding.inflate(getLayoutInflater());  // create a instance of the binding class
        setContentView(binding.getRoot());  // make it the active view on the screen

        // Sample data to populate the cards
        List<Pair<String, String>> datesAndLabels = Arrays.asList(
                new Pair<>("Nov 6", "Today"),
                new Pair<>("Nov 7", "Tomorrow"),
                new Pair<>("Nov 8", "Sun"),
                new Pair<>("Nov 9", "Mon")
        );

        List<String> times = Arrays.asList("16:00", "16:30", "17:00", "17:30", "18:00", "18:30");

        // Loop through the data and inflate card views
        for (Pair<String, String> item : datesAndLabels) {
            // Inflate the card_item
            CardView cardView = (CardView) getLayoutInflater().inflate(R.layout.date_cardview,
                    binding.dateCardContainer, false);

            // Reference in the date_cardview.xml
            AppCompatTextView dateText = cardView.findViewById(R.id.textDate);
            AppCompatTextView labelText = cardView.findViewById(R.id.textLabel);

            // Set values
            dateText.setText(item.first);
            labelText.setText(item.second);

            // Add card view to the container
            binding.dateCardContainer.addView(cardView);
        }

        // Loop through the time and inflate card views
        for (String time : times) {
            CardView cardView = (CardView) getLayoutInflater().inflate(R.layout.time_cardview,
                    binding.dateCardContainer, false);

            // Reference in the time_cardview.xml
            AppCompatTextView timeText = cardView.findViewById(R.id.textTime);

            // Set value
            timeText.setText(time);

            binding.timeCardContainer.addView(cardView);
        }
    }
}