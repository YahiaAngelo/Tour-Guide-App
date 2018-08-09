package com.example.yahia.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);
        ArrayList<Category> list = new ArrayList<>();
        list.add(new Category("Giza's Pyramids", "The Pyramids of Giza", R.drawable.pyramids, "geo:29.977485, 31.132479?q=The Great Pyramid of Giza"));
        list.add(new Category("The Egyptian Museum", "a home of ancient Egyptian antiquities", R.drawable.egyptianmuesum,
                "geo:30.0478468, 31.233649300000025?q=Egyptian Museum Cairo"));
        list.add(new Category("Saladin Citadel", "The Citadel contains popular Mosques and Museums", R.drawable.cairocitadel, "geo:30.029860, 31.261100?q=Cairo Citadel"));
        list.add(new Category("Giza's Pyramids", "The Pyramids of Giza", R.drawable.pyramids, "geo:29.977485, 31.132479?q=The Great Pyramid of Giza"));
        list.add(new Category("The Egyptian Museum", "a home of ancient Egyptian antiquities", R.drawable.egyptianmuesum,
                "geo:30.0478468, 31.233649300000025?q=Egyptian Museum Cairo"));
        list.add(new Category("Saladin Citadel", "The Citadel contains popular Mosques and Museums", R.drawable.cairocitadel, "geo:30.029860, 31.261100?q=Cairo Citadel"));

        CategoryAdapter adapter = new CategoryAdapter(getContext(), list);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
