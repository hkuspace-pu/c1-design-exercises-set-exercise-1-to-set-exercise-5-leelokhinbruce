package com.example.adminreservationmanagementapp.mainpage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adminreservationmanagementapp.R;
import com.example.adminreservationmanagementapp.databinding.FragmentMenuBinding;
import com.example.adminreservationmanagementapp.databinding.FragmentMoreBinding;

public class MoreFragment extends Fragment {
    private FragmentMoreBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMoreBinding.inflate(getLayoutInflater(), container, false);
        View view = binding.getRoot();

        return view;
    }
}