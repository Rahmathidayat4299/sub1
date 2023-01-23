package com.dicoding.jetpackcompose.travelingapp.core.data

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
}