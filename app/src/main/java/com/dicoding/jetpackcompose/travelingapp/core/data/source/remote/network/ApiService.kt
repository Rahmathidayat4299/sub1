package com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.network

import com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.response.ListTourismResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Rahmat Hidayat on 24/01/2023.
 */
interface ApiService {
    @GET("list")
    suspend fun getList(): ListTourismResponse
}