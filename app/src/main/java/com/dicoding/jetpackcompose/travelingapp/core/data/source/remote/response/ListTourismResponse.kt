package com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Rahmat Hidayat on 24/01/2023.
 */
data class ListTourismResponse(

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String,

    @field:SerializedName("places")
    val places: List<TourismResponse>
)