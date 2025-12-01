package com.example.adminreservationmanagementapp.mainpage;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.adminreservationmanagementapp.AddMenuItemActivity;
import com.example.adminreservationmanagementapp.SpecificMenuActivity;
import com.example.adminreservationmanagementapp.databinding.FragmentMenuBinding;
import com.google.android.material.card.MaterialCardView;

public class MenuFragment extends Fragment {
    private FragmentMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(getLayoutInflater(), container, false);
        View view = binding.getRoot();

        setupCardClick(binding.cardViewBtnBreakfast, "Breakfast");
        setupCardClick(binding.cardViewBtnLunch, "Lunch");
        setupCardClick(binding.cardViewBtnTeaTime, "Tea Time");
        setupCardClick(binding.cardViewBtnDinner, "Dinner");

        binding.btnAddItem.setOnClickListener(viewAddItem -> {
            Intent intent = new Intent(getContext(), AddMenuItemActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        });

        return view;
    }

    // Browse Menu
    private void setupCardClick(MaterialCardView cardViewBtn, String menuType) {
        cardViewBtn.setOnClickListener(viewMenu -> {
            Intent intent = new Intent(getContext(), SpecificMenuActivity.class);
            intent.putExtra("screen_title", menuType);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        });
    }
}