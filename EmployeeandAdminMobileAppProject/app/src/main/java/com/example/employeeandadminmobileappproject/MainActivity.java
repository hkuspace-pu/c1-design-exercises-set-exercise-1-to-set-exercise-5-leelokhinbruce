package com.example.employeeandadminmobileappproject;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    EmployeeHomeFragment employeeHomeFragment = new EmployeeHomeFragment();
    EmployeeNotificationFragment employeeNotificationFragment = new EmployeeNotificationFragment();
    EmployeeLeaveFragment employeeLeaveFragment = new EmployeeLeaveFragment();
    EmployeeProfileFragment employeeProfileFragment = new EmployeeProfileFragment();
    EmployeeProfileRoleDetailsFragment employeeProfileRoleDetailsFragment = new EmployeeProfileRoleDetailsFragment();

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.bottom_nav_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int itemId = item.getItemId();
//
//        if(itemId == R.id.home){
//            getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeHomeFragment).commit();
//            return true;
//        } else if(itemId == R.id.notification){
//            getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeNotificationFragment).commit();
//            return true;
//        } else if(itemId == R.id.leave) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeLeaveFragment).commit();
//            return true;
//        } else if(itemId == R.id.personal_profile) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeProfileFragment).commit();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        if (savedInstanceState == null) {
            // Load the initial fragment
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new EmployeeHomeFragment())
                    .commit();
        }


        bottomNavigationView = findViewById(R.id.bottom_nav_menu_id);
//
//        // Change the fragment from container to homepage while starting the app
        getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeHomeFragment).commit();
//
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeHomeFragment).commit();
                    return true;
                } else if (itemId == R.id.notification) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeNotificationFragment).commit();
                    return true;
                } else if (itemId == R.id.leave) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeLeaveFragment).commit();
                    return true;
                }
//                } else if (itemId == R.id.personal_profile) {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeProfileFragment).commit();
//                    return true;
//                } else if (itemId == R.id.role_profile) {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.container, employeeProfileRoleDetailsFragment).commit();
//                    return true;
//                }

                return false;
            }
        });
    }
}