package com.example.yahia.tourguide;

import android.net.Uri;

public class Category {

    private String mPrimaryText;
    private String mSecondaryText;
    private int mImage;
    private String mGmmIntent;

    public Category(String primaryText ,String secondaryText,int image, String gmmIntent){
       mPrimaryText = primaryText;
       mSecondaryText = secondaryText;
       mImage =image;
       mGmmIntent = gmmIntent;

    }

    public String getPrimaryText(){
        return mPrimaryText;
    }

    public String getSecondaryText(){
        return mSecondaryText;
    }

    public int getmImage(){
        return mImage;
    }

    public String getmGmmIntent(){
        return mGmmIntent;
    }
}
