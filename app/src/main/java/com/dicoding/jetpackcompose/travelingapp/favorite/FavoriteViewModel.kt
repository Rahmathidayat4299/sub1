package com.dicoding.jetpackcompose.travelingapp.favorite

import androidx.lifecycle.ViewModel
import com.dicoding.jetpackcompose.travelingapp.core.data.TourismRepository

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
class FavoriteViewModel(tourismRepository: TourismRepository) : ViewModel() {

    val favoriteTourism = tourismRepository.getFavoriteTourism()

}
