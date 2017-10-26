package com.example.lynnphayu.mtu;

/**
 * Created by lynnphayu on 9/7/17.
 */

public class postModel {

        String title;
        String content;

        public postModel(String title, String content){
                this.title = title;
                this.content = content;
        }

        public String getTitle(){
                return title;
        }

        public String getContent(){
                return content;
        }
}
