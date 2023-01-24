package com.dicoding.jetpackcompose.travelingapp.core.domain.usecase

import com.dicoding.jetpackcompose.travelingapp.core.domain.model.Tourism
import com.dicoding.jetpackcompose.travelingapp.core.domain.repository.ITourismRepository

/**
 * Created by Rahmat Hidayat on 24/01/2023.
 */
class TourismInteractor(private val tourismRepository: ITourismRepository): TourismUseCase {

    override fun getAllTourism() = tourismRepository.getAllTourism()

    override fun getFavoriteTourism() = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) = tourismRepository.setFavoriteTourism(tourism, state)
}