package com.cloudray.richienews.easyrecycler;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cloudray.richienews.R;
import com.cloudray.richienews.model.PopularChoice;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by Cloud on 2017/1/23.
 */

public class NewsViewHolder extends BaseViewHolder<PopularChoice.News>{

    ImageView imageView;
    TextView title;
    TextView time;

    public NewsViewHolder(ViewGroup view) {
        super(view, R.layout.listitem_news);
        //imageView = (ImageView)itemView.findViewById(R.id.listitem_news_image);
        imageView = $(R.id.listitem_news_image);
        title = $(R.id.listitem_news_title); // use $ to bind
        time = $(R.id.listitem_news_time);
    }

    public void setData(final PopularChoice.News news){
        // imageView.setImageURI(Uri.parse(news.getPicUrl()));
        // try to use glide
        Glide.with(getContext())
                .load(news.getPicUrl())
                .placeholder(R.mipmap.ic_launcher)
                .centerCrop()
                .into(imageView);

        title.setText(news.getTitle());
        time.setText(news.getCtime());
    }
}
