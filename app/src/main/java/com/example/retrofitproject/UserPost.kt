package com.example.retrofitproject

import com.google.gson.annotations.SerializedName

data class UserPost (
    @SerializedName("userId")
    var userId: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("title")
    var title: String,
    @SerializedName("body")
    var body: String
)