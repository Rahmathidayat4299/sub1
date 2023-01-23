package com.dicoding.jetpackcompose.travelingapp.detail

import android.view.View
import androidx.lifecycle.ViewModel
import com.dicoding.jetpackcompose.travelingapp.core.data.TourismRepository
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.entity.TourismEntity

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
class DetailTourismViewModel(private val tourismRepository: TourismRepository):ViewModel() {
    fun setFavoriteTourism(tourism: TourismEntity, newStatus:Boolean) = tourismRepository.setFavoriteTourism(tourism, newStatus)
}