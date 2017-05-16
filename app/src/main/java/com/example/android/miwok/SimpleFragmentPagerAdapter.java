package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tin on 2017-05-16.
 */

//                Setup Pager Adapater

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if (position == 2){
            return new ColorFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    //Total pages in the adapter
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return "Numbers";
            case 1:
                return "Family";
            case 2:
                return "Color";
            case 3:
                return "Phrases";
            default:
                return null;
        }
    }
};
