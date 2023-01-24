package com.dicoding.jetpackcompose.travelingapp.di

import com.dicoding.jetpackcompose.travelingapp.core.domain.usecase.TourismInteractor
import com.dicoding.jetpackcompose.travelingapp.core.domain.usecase.TourismUseCase
import com.dicoding.jetpackcompose.travelingapp.detail.DetailTourismViewModel
import com.dicoding.jetpackcompose.travelingapp.favorite.FavoriteViewModel
import com.dicoding.jetpackcompose.travelingapp.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Rahmat Hidayat on 24/01/2023.
 */
val useCaseModule = module {
    factory<TourismUseCase> { TourismInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { DetailTourismViewModel(get()) }
}