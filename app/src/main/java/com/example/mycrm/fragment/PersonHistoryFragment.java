package com.example.mycrm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mycrm.R;


public class PersonHistoryFragment extends Fragment {
    public static final int LAYOUT = R.layout.fragment_tab_person_history;
    private View view;
    public static PersonHistoryFragment getInstans(){
        Bundle args = new Bundle();
        PersonHistoryFragment fragment = new PersonHistoryFragment();
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
