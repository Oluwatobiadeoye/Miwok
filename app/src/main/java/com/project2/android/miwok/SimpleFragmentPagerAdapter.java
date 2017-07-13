package com.project2.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by adeoye oluwatobi on 7/10/2017.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] word_list = new String[] {"Numbers","Family","Colors","Phrases"};
    public SimpleFragmentPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return word_list[0];
        } else if (position == 1){
            return word_list[1];
        } else if (position == 2) {
            return word_list [2];
        } else {
            return word_list[3];
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
