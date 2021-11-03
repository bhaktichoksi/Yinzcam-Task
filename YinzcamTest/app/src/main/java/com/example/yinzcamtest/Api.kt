package com.example.yinzcamtest

import com.example.yinzcamtest.pojo.Yinzcam
import retrofit2.Call;
import retrofit2.http.GET;

interface Api {

    //urls
    @GET("schedule.json")
    fun getYinzcam(): Call<Yinzcam>?

}