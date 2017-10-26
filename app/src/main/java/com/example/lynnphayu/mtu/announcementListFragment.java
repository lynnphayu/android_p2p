package com.example.lynnphayu.mtu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lynnphayu on 9/7/17.
 */

public class announcementListFragment extends Fragment {

        @Override
        public void onCreate(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
                View view = inflater.inflate(R.layout.announcements,container,false);
                return view;
        }
}
