package com.cloudray.richienews.activity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.cloudray.richienews.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsDetailActivity extends AppCompatActivity {

    @BindView(R.id.activity_news_imageview)
    ImageView imageView;

    @BindView(R.id.activity_news_webview)
    WebView webView;

    @BindView(R.id.activity_news_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        ArrayList data = bundle.getStringArrayList("data");
        String picUrl = (String)data.get(0);
        String url = (String)data.get(1);

        toolbar.setTitle("晨哥新闻");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // can not use toolbar.xxxx here, that's why we setSupportxxxx above
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        webView.loadUrl(url);
        Glide.with(this)
                .load(picUrl)
                .error(R.mipmap.ic_launcher)
                .fitCenter()
                .into(imageView);

    }
}
