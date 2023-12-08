package com.test.rocaberte_mark_semi_final

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface TweetApiService {
    @POST("tweet/rocaberte/")
    fun createTweet(@Body tweet: Tweet): Call<Void>

    @PUT("tweet/rocaberte/{tweetId}")
    fun updateTweet(@Path("tweetId") id: String, @Body tweet: Tweet): Call<Tweet>
}