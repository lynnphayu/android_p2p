package com.example.lynnphayu.mtu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * Created by lynnphayu on 9/6/17.
 */

public class postListAdapter extends RecyclerView.Adapter<postListAdapter.ViewHolder>{

        private List<postModel> postList;

        public postListAdapter(List<postModel> postData){
                this.postList = postData;
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
                View view = LayoutInflater.from(globalLoader.getContext()).inflate(R.layout.card_view,parent,false);
                return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(postListAdapter.ViewHolder holder, int position) {

                TextView title = holder.title;
                TextView content = holder.content;
                title.setText(postList.get(position).getTitle());
                content.setText(postList.get(position).getContent());

        }

        @Override
        public int getItemCount() {
                return postList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

                TextView title;
                TextView content;
                public ViewHolder(View view) {
                        super(view);
                        this.title = (TextView) view.findViewById(R.id.title);
                        this.content = (TextView) view.findViewById(R.id.content);
                }

                @Override
                public void onClick(View view) {

                }
        }
}
