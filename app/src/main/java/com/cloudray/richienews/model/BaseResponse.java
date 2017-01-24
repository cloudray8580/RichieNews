package com.cloudray.richienews.model;

/**
 * Created by Cloud on 2017/1/23.
 */

public class BaseResponse <T> {
    int code;
    String msg;
    T content;
}
