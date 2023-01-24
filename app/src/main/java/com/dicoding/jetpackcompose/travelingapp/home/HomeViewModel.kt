package com.dicoding.jetpackcompose.travelingapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.jetpackcompose.travelingapp.core.domain.usecase.TourismUseCase

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}