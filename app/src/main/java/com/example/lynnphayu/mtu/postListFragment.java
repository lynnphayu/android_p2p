package com.example.lynnphayu.mtu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lynnphayu on 9/6/17.
 */

public class postListFragment extends Fragment {

        postListAdapter adapter;
        @Override
        public void onCreate(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                List<postModel> postDummyData = new ArrayList<>();
                for (int i=0; i<dummyData.titles.length; i++){
                        postDummyData.add(new postModel(dummyData.titles[i],dummyData.contents[i]));
                }
                adapter = new postListAdapter(postDummyData);
        }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
                View view = inflater.inflate(R.layout.postlist_fragment,container,false);
                RecyclerView recyclerViewPostList = (RecyclerView) view.findViewById(R.id.post_list);


                recyclerViewPostList.setAdapter(adapter);
                recyclerViewPostList.setLayoutManager(new LinearLayoutManager(globalLoader.getContext()));
                return view;
        }
}
