package com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.network

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
sealed class ApiResponse<out R> {
    data class Success<out T>(val data: T) : ApiResponse<T>()
    data class Error(val errorMessage: String) : ApiResponse<Nothing>()
    object Empty : ApiResponse<Nothing>()
}