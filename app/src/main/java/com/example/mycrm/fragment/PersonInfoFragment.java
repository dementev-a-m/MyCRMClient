package com.example.mycrm.fragment;



import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mycrm.R;

/**
 * Created by Антон Дементьев on 03.04.2017.
 */

public class PersonInfoFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_tab_person_info;
    private View view;
    private TextView textView;
    public static PersonInfoFragment getInstans(){
        Bundle args = new Bundle();
        PersonInfoFragment personInfoFragment = new PersonInfoFragment();
        personInfoFragment.setArguments(args);

        return personInfoFragment;

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
