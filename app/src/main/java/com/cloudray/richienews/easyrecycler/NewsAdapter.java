package com.cloudray.richienews.easyrecycler;

import android.content.Context;
import android.view.ViewGroup;

import com.cloudray.richienews.model.PopularChoice;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by Cloud on 2017/1/23.
 */

public class NewsAdapter extends RecyclerArrayAdapter<PopularChoice.News>{

    public NewsAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsViewHolder(parent);
    }
}
