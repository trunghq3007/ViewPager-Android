package com.example.admin.viewpager_android;


//import android.support.v4.app.FragmentStatePagerAdapter;

//import android.support.v4.app.FragmentStatePagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author Hà Quang Trung
 * @version 1.0.0
 * @description
 * @desc Technical Director, FPT-Software.
 * @created 6/7/2018
 * @updated 6/7/2018
 * @modified by
 * @updated on 6/7/2018
 * @since 1.0
 */
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new AndroidFragment();
                break;
            case 1:
                frag = new IOSFragment();
                break;
            case 2:
                frag = new PHPFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Android";
                break;
            case 1:
                title = "IOS";
                break;
            case 2:
                title = "PHP";
                break;
        }

        return title;
    }

}