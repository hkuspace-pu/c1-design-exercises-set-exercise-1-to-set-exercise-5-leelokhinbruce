package com.example.guestreservationapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.guestreservationapp.databinding.ActivityLoginBinding;
import com.example.guestreservationapp.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Fragment homeFragment, menuFragment, reservationsFragment, discoverFragment, profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());  // create a instance of the binding class
        View view = binding.getRoot();  // get a reference to the root view of the corresponding layout file
        setContentView(view);  // make it the active view on the screen

        homeFragment = new HomeFragment();
        menuFragment = new MenuFragment();
        reservationsFragment = new ReservationsFragment();
        discoverFragment = new DiscoverFragment();
        profileFragment = new ProfileFragment();

        if (savedInstanceState == null)
            setCurrentFragment(homeFragment);  // Load the initial fragment

        binding.bottomNavView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                setCurrentFragment(homeFragment);
                return true;
            } else if (itemId == R.id.menu) {
                setCurrentFragment(menuFragment);
                return true;
            } else if (itemId == R.id.reservations) {
                setCurrentFragment(reservationsFragment);
                return true;
            } else if (itemId == R.id.discover) {
                setCurrentFragment(discoverFragment);
                return true;
            } else if (itemId == R.id.profile) {
                setCurrentFragment(profileFragment);
                return true;
            }

            return false;
        });
    }

    private void setCurrentFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainContainer, fragment)
                .commit();
    }
}