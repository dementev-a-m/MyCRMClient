package com.example.mycrm.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.example.mycrm.fragment.PersonBuyFragment;
import com.example.mycrm.fragment.PersonHistoryFragment;
import com.example.mycrm.fragment.PersonInfoFragment;

public class FragmentPagePersonAdapter extends FragmentPagerAdapter {
    private String[] tabs;
    public FragmentPagePersonAdapter(FragmentManager fm) {
        super(fm);
        tabs =new String[] {"Персоналная информация", "Покупки", "История" };
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PersonInfoFragment.getInstans();
            case 1:
                return PersonBuyFragment.getInstans();
            case 2:
                return PersonHistoryFragment.getInstans();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return tabs.length;
    }

}
