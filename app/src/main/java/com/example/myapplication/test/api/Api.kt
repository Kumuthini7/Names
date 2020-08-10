package com.example.myapplication.test.api

import com.example.myapplication.test.model.Response
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Kumuthini.N on 10-08-2020
 */
interface Api {

    @GET("api/breeds/list")
    fun getResponse(): Call<Response>

}
