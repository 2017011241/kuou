package com.example.a18801.kuou.Util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 18801 on 2019/12/1.
 */

public class HttpUtil
{
    public static void sendOkHttpRequests(String address,okhttp3.Callback callback)
    {
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
