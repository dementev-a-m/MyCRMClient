package com.example.mycrm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mycrm.R;

/**
 * Created by Антон Дементьев on 05.04.2017.
 */

public class PersonBuyFragment extends Fragment {
    public static final int LAYOUT =R.layout.fragment_tab_person_buy;
    private View view;
    public static PersonBuyFragment getInstans(){
        Bundle args = new Bundle();
        PersonBuyFragment fragment = new PersonBuyFragment();
        fragment.setArguments(args);
        return fragment;

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(LAYOUT,container,false);
        return view;
    }
}

