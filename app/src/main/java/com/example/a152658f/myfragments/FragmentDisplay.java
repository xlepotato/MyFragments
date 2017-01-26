package com.example.a152658f.myfragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDisplay extends Fragment {

    static final String ARG_USERINPUT = "userinput";

    public FragmentDisplay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        TextView fragBTV;
        View rootView = inflater.inflate(R.layout.fragment_display,container,false);
        fragBTV = (TextView) rootView.findViewById(R.id.fragBTV);
        fragBTV.setText("Text keyed in by user : " +
        getArguments().getString(FragmentDisplay.ARG_USERINPUT));
        return rootView;
    }

}
