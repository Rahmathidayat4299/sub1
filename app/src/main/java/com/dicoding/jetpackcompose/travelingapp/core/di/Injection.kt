package com.dicoding.jetpackcompose.travelingapp.core.di

import android.content.Context
import com.dicoding.jetpackcompose.travelingapp.core.data.TourismRepository
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.LocalDataSource
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.room.TourismDatabase
import com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.RemoteDataSource
import com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.network.ApiConfig
import com.dicoding.jetpackcompose.travelingapp.core.domain.repository.ITourismRepository
import com.dicoding.jetpackcompose.travelingapp.core.domain.usecase.TourismInteractor
import com.dicoding.jetpackcompose.travelingapp.core.domain.usecase.TourismUseCase
import com.dicoding.jetpackcompose.travelingapp.core.utils.AppExecutors

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
object Injection {
    private fun provideRepository(context: Context): ITourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(ApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideTourismUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteractor(repository)
    }
}