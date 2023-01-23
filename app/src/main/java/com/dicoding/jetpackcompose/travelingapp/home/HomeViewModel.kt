package com.dicoding.jetpackcompose.travelingapp.home

import androidx.lifecycle.ViewModel
import com.dicoding.jetpackcompose.travelingapp.core.data.TourismRepository

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
class HomeViewModel(tourismRepository: TourismRepository) : ViewModel() {
    val tourism = tourismRepository.getAllTourism()
}