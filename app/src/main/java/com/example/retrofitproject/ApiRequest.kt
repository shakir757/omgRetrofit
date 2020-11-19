package com.example.retrofitproject

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiRequest {
    @GET("posts/")
    fun getUserPostData(): Observable<UserPost>
}