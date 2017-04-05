package com.example.mycrm.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mycrm.R;
import com.example.mycrm.adapter.FragmentPagePersonAdapter;

public class PersonActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        initTabs();
    }

    private void initTabs() {
        viewPager = (ViewPager) findViewById(R.id.viewPegerPerson);
        FragmentPagePersonAdapter adapter = new FragmentPagePersonAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayoutPerson);
        tabLayout.setupWithViewPager(viewPager);
    }
}
