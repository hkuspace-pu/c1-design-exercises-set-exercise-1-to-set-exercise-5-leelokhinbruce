package com.example.guestreservationapp.mainpage;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guestreservationapp.R;
import com.example.guestreservationapp.databinding.FragmentReservationsBinding;

public class ReservationsFragment extends Fragment {
    private FragmentReservationsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentReservationsBinding.inflate(getLayoutInflater(), container, false);
        View view = binding.getRoot();

        binding.btnHistory.setOnClickListener(viewHistory ->
                startActivity(new Intent(getActivity(), com.example.guestreservationapp.reservation.ReservationHistoryActivity.class)));

        return view;
    }
}