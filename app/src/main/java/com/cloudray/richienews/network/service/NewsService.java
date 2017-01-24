package com.cloudray.richienews.network.service;

import com.cloudray.richienews.model.PopularChoice;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Cloud on 2017/1/23.
 */

public interface NewsService {
    @GET("wxnew/")
    Observable<PopularChoice> getNews(
            @Query("key") String key,
            @Query("num") int num
    );
}
