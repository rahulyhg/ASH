package com.wohlig.jaipurpinkpanthers.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wohlig.jaipurpinkpanthers.R;
import com.wohlig.jaipurpinkpanthers.util.CustomFonts;

public class PanthersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_panthers, container, false);

        LinearLayout layoutPlayer = (LinearLayout) view.findViewById(R.id.ganga);
        TextView layoutPlayerName = (TextView) layoutPlayer
                .findViewById(R.id.player_name);

        TextView layoutListPlayerType = (TextView) layoutPlayer
                .findViewById(R.id.player_type);

        layoutPlayerName.setText("RAJU LAL CHOUDHARY");
        layoutPlayerName.setTypeface(CustomFonts.getProfileFont(getActivity()));
        layoutListPlayerType.setTypeface(CustomFonts.getProfileFont(getActivity()));

        Log.v("JPP","Inside pF oCV");

        return view;
    }

}
