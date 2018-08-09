package com.example.yahia.tourguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int i) {
       if (i == 0){
           return new AttractionsFragment();

       } if (i == 1){
            return new RestaurantFragment();
        } if (i == 2){
            return new HotelsFragment();
        }else return new MallsFragment();
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Attractions";
        }if (position == 1){
            return "Restaurants";
        }if (position == 2){
            return "Hotels";
        }
        else return "Malls";
    }
}

