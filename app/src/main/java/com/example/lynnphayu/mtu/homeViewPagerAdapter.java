package com.example.lynnphayu.mtu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lynnphayu on 9/6/17.
 */

public class homeViewPagerAdapter extends FragmentStatePagerAdapter {

        private List<Fragment> FragmentList= new ArrayList<>();

        public homeViewPagerAdapter(FragmentManager fm) {
                super(fm);
        }

        @Override
        public Fragment getItem(int position) {
                return FragmentList.get(position);
        }

        @Override
        public int getCount() {
                return FragmentList.size();
        }

        public void addFragment(Fragment fragment){
                FragmentList.add(fragment);
        }

}
