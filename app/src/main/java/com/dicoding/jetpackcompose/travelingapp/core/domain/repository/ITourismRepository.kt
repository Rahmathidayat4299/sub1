package com.dicoding.jetpackcompose.travelingapp.core.domain.repository

import androidx.lifecycle.LiveData
import com.dicoding.jetpackcompose.travelingapp.core.data.Resource
import com.dicoding.jetpackcompose.travelingapp.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

/**
 * Created by Rahmat Hidayat on 24/01/2023.
 */
interface ITourismRepository {

    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)

}