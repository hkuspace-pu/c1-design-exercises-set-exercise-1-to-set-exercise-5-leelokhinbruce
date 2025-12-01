package com.example.adminreservationmanagementapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.adminreservationmanagementapp.reservations.PendingListFragment;

public class ReservationPagerAdapter extends FragmentStateAdapter {
    private static final int TAB_PENDING = 0;
    private static final int TAB_CONFIRMED = 1;

    public ReservationPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == TAB_PENDING) {
            return new PendingListFragment();
        } else {
            // Fallback
            return new PendingListFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;  // Pending + Confirmed
    }
}
