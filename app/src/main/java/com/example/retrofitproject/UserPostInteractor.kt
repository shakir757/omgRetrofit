package com.example.retrofitproject

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


const val BASE_URL = "https://jsonplaceholder.typicode.com/"

class UserPostInteractor {
    private var api: ApiRequest = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(ApiRequest::class.java)

    fun getUserPost(): Single<UserPost> {
        return Single.fromObservable(api.getUserPostData())
    }
}