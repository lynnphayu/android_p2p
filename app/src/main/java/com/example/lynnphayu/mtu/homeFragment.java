package com.example.lynnphayu.mtu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lynnphayu on 9/6/17.
 */

public class homeFragment extends Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

                View view = inflater.inflate(R.layout.home_fragment, container,false);
                ViewPager viewpager = (ViewPager) view.findViewById(R.id.home_tab_pager);
                viewpager.setOffscreenPageLimit(2);

                homeViewPagerAdapter viewPagerAdapter = new homeViewPagerAdapter(getChildFragmentManager());
                viewPagerAdapter.addFragment(new postListFragment());
                viewPagerAdapter.addFragment(new announcementListFragment());
                viewpager.setAdapter(viewPagerAdapter);

                TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs_home);
                tabLayout.setupWithViewPager(viewpager);
                tabLayout.getTabAt(0).setText("Home");
                tabLayout.getTabAt(1).setText("Announcements");

                return view;
        }

}
