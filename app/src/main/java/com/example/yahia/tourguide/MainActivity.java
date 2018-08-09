package com.example.yahia.tourguide;

import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final TabLayout tabLayout = findViewById(R.id.tabs);

        final ViewPager viewPager = findViewById(R.id.pager);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        tabLayout.getTabAt(0).setIcon(R.drawable.baseline_location_city_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.baseline_restaurant_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.baseline_hotel_24);
        tabLayout.getTabAt(3).setIcon(R.drawable.baseline_local_mall_24);
        tabLayout.setTabTextColors(getResources().getColor(R.color.tabNormal),getResources().getColor(R.color.tabSelected));
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.tabSelected));
        tabLayout.getTabAt(tabLayout.getSelectedTabPosition()).getIcon().setColorFilter(getResources().getColor(R.color.tabSelected), PorterDuff.Mode.SRC_IN);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(getResources().getColor(R.color.tabSelected), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                tab.getIcon().setColorFilter(getResources().getColor(R.color.tabNormal), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(getResources().getColor(R.color.tabSelected), PorterDuff.Mode.SRC_IN);
            }
        });

    }

}


