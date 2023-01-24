package com.dicoding.jetpackcompose.travelingapp.detail

import android.view.View
import androidx.lifecycle.ViewModel
import com.dicoding.jetpackcompose.travelingapp.core.data.TourismRepository
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.entity.TourismEntity
import com.dicoding.jetpackcompose.travelingapp.core.domain.model.Tourism
import com.dicoding.jetpackcompose.travelingapp.core.domain.usecase.TourismUseCase

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}