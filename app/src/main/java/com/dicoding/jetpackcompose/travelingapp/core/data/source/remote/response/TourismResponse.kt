package com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.response

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
data class TourismResponse(
    val id: String,
    val name: String,
    val description: String,
    val address: String,
    val longitude: Double,
    val latitude: Double,
    val like: Int,
    val image: String
)