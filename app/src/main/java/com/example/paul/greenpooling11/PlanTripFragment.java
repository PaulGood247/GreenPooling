package com.example.paul.greenpooling11;

/**
 * Created by Paul on 08/11/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlanTripFragment extends Fragment {

    public PlanTripFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_plan_trip, container, false);

        return rootView;
    }

}