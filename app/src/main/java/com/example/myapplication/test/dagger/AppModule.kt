package com.example.myapplication.test.dagger;

import com.example.myapplication.test.api.Api
import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Kumuthini.N on 10-08-2020
 */
@Module
class AppModule {

  @Provides
  @Singleton
  fun providesRetrofit(): Retrofit {
    return Retrofit.Builder()
      .baseUrl("https://dog.ceo/")
      .addConverterFactory(GsonConverterFactory.create())
      .build()
  }

  @Provides
  @Singleton
  fun providesApi(retrofit: Retrofit): Api {
    return retrofit.create(Api::class.java)
  }
}


