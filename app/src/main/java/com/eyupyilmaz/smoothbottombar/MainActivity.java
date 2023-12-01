package com.eyupyilmaz.smoothbottombar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

import com.eyupyilmaz.smoothbottombar.fragment.HomeFragment;
import com.eyupyilmaz.smoothbottombar.fragment.MoreFragment;
import com.eyupyilmaz.smoothbottombar.fragment.PersonFragment;
import com.eyupyilmaz.smoothbottombar.fragment.SettingsFragment;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {

    SmoothBottomBar smoothBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smoothBottomBar = findViewById(R.id.bottomBar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, new HomeFragment());
        fragmentTransaction.commit();

        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {

                if (i == 0){

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new HomeFragment());
                    fragmentTransaction.commit();

                    smoothBottomBar.setBackgroundColor(Color.parseColor("#000000"));
                    getWindow().setNavigationBarColor(Color.parseColor("#000000"));
                    getWindow().setStatusBarColor(Color.parseColor("#000000"));
                } else if (i == 1) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new SettingsFragment());
                    fragmentTransaction.commit();

                    smoothBottomBar.setBackgroundColor(Color.parseColor("#FF018786"));
                    getWindow().setNavigationBarColor(Color.parseColor("#FF018786"));
                    getWindow().setStatusBarColor(Color.parseColor("#FF018786"));
                } else if (i == 2) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new PersonFragment());
                    fragmentTransaction.commit();

                    smoothBottomBar.setBackgroundColor(Color.parseColor("#5792a1"));
                    getWindow().setNavigationBarColor(Color.parseColor("#5792a1"));
                    getWindow().setStatusBarColor(Color.parseColor("#5792a1"));

                } else if (i == 3) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new MoreFragment());
                    fragmentTransaction.commit();

                    smoothBottomBar.setBackgroundColor(Color.parseColor("#776688"));
                    getWindow().setNavigationBarColor(Color.parseColor("#776688"));
                    getWindow().setStatusBarColor(Color.parseColor("#776688"));
                }


                return false;
            }
        });
    }
}