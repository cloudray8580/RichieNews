package com.cloudray.richienews.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Cloud on 2017/1/23.
 */

public class PopularChoice extends MyBaseResponse {

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    @SerializedName("newslist")
    List<News> newsList;

    public static class News{

        String ctime; // yyyy-MM-dd
        String title;
        String description;
        String picUrl;
        String url;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
