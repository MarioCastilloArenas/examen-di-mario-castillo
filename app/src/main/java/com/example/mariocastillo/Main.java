package com.example.mariocastillo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Main extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        com.example.pruebamaterial.GestorFragments gestorFragments = new com.example.pruebamaterial.GestorFragments(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        gestorFragments.addFragment(new com.example.mariocastillo.Fragment11(), "DAR LIRBO");
        gestorFragments.addFragment(new com.example.mariocastillo.Fragment22(), "PEDIR LIBRO");
        gestorFragments.addFragment(new com.example.mariocastillo.Fragment33(), "PERFIL");
        viewPager.setAdapter(gestorFragments);

    }
}