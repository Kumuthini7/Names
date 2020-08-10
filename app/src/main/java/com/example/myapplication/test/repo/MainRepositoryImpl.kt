package com.example.myapplication.test.repo

import com.example.myapplication.test.api.Api
import retrofit2.Call
import retrofit2.Callback

/**
 * Created by Kumuthini.N on 10-08-2020
 */
class MainRepositoryImpl(private val api: Api) :
    MainRepository {
    override fun getResponse(
        onSuccess: (Response: com.example.myapplication.test.model.Response) -> Unit,
        onFailure: (t: Throwable) -> Unit
    ) {
        api.getResponse().enqueue(object : Callback<com.example.myapplication.test.model.Response> {
            override fun onResponse(call: Call<com.example.myapplication.test.model.Response>, response: retrofit2.Response<com.example.myapplication.test.model.Response>) {
                response.body()?.let { Response ->
                    onSuccess.invoke(Response)
                }
            }

            override fun onFailure(call: Call<com.example.myapplication.test.model.Response>, t: Throwable) {
                onFailure.invoke(t)
            }
        })
    }

}
