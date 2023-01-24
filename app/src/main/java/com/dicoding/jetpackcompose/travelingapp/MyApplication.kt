package com.dicoding.jetpackcompose.travelingapp

import android.app.Application
import com.dicoding.jetpackcompose.travelingapp.core.di.databaseModule
import com.dicoding.jetpackcompose.travelingapp.core.di.networkModule
import com.dicoding.jetpackcompose.travelingapp.core.di.repositoryModule
import com.dicoding.jetpackcompose.travelingapp.di.useCaseModule
import com.dicoding.jetpackcompose.travelingapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Created by Rahmat Hidayat on 24/01/2023.
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}