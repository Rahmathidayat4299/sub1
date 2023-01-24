package com.dicoding.jetpackcompose.travelingapp.core.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.entity.TourismEntity
import kotlinx.coroutines.flow.Flow

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
@Dao
interface TourismDao {

    @Query("SELECT * FROM tourism")
    fun getAllTourism(): Flow<List<TourismEntity>>

    @Query("SELECT * FROM tourism where isFavorite = 1")
    fun getFavoriteTourism(): Flow<List<TourismEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     suspend fun insertTourism(tourism: List<TourismEntity>)

    @Update
    fun updateFavoriteTourism(tourism: TourismEntity)
}