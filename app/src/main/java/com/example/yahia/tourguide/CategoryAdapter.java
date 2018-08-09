package com.example.yahia.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Context context, ArrayList<Category> categories){
        super(context, 0 , categories);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        final Category currentCategory = getItem(position);

        TextView primaryTextView = (TextView) listItemView.findViewById(R.id.primary_text);
        primaryTextView.setText(currentCategory.getPrimaryText());

        TextView secondaryTextView = (TextView) listItemView.findViewById(R.id.secondary_text);

        secondaryTextView.setText(currentCategory.getSecondaryText());

        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.category_image);

        mImageView.setImageResource(currentCategory.getmImage());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse(currentCategory.getmGmmIntent());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(mapIntent);
                }
            }
        });

        return listItemView;



    }
}
