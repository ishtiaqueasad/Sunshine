package com.example.administrator.sunshine;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent intent =getActivity().getIntent();
        String a = intent.getStringExtra("hello");
        View view=inflater.inflate(R.layout.fragment_detail, container, false);
        TextView detailTextview = (TextView) view.findViewById(R.id.detail_textview);
        detailTextview.setText(a);

        return view;
    }
}
