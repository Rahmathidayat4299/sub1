package com.dicoding.jetpackcompose.travelingapp.core.data.source.local

import androidx.lifecycle.LiveData
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.entity.TourismEntity
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.room.TourismDao
import kotlinx.coroutines.flow.Flow

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
class LocalDataSource(private val tourismDao: TourismDao) {

    companion object {
        private var instance: LocalDataSource? = null

        fun getInstance(tourismDao: TourismDao): LocalDataSource =
            instance ?: synchronized(this) {
                instance ?: LocalDataSource(tourismDao)
            }
    }

    fun getAllTourism(): Flow<List<TourismEntity>> = tourismDao.getAllTourism()

    fun getFavoriteTourism(): Flow<List<TourismEntity>> = tourismDao.getFavoriteTourism()

    suspend fun insertTourism(tourismList: List<TourismEntity>) = tourismDao.insertTourism(tourismList)

    fun setFavoriteTourism(tourism: TourismEntity, newState: Boolean) {
        tourism.isFavorite = newState
        tourismDao.updateFavoriteTourism(tourism)
    }
}