package com.example.administrator.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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
        String message=getActivity().getIntent().getStringExtra("hello");

        View view=inflater.inflate(R.layout.fragment_detail, container, false);
        TextView showResult = (TextView)view.findViewById(R.id.detailActivity_textview);
        showResult.setText(message);

        return view;
    }
}
