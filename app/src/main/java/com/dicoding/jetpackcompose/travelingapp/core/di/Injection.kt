package com.dicoding.jetpackcompose.travelingapp.core.di

import android.content.Context
import com.dicoding.jetpackcompose.travelingapp.core.data.TourismRepository
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.LocalDataSource
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.room.TourismDatabase
import com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.RemoteDataSource
import com.dicoding.jetpackcompose.travelingapp.core.utils.AppExecutors
import com.dicoding.jetpackcompose.travelingapp.core.utils.JsonHelper

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
object Injection {
    fun provideRepository(context: Context): TourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}