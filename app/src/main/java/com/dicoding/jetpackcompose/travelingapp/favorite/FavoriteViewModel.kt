package com.dicoding.jetpackcompose.travelingapp.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.jetpackcompose.travelingapp.core.domain.usecase.TourismUseCase

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()

}
