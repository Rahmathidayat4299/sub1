package com.dicoding.jetpackcompose.travelingapp.core.utils

import com.dicoding.jetpackcompose.travelingapp.core.data.source.local.entity.TourismEntity
import com.dicoding.jetpackcompose.travelingapp.core.data.source.remote.response.TourismResponse

/**
 * Created by Rahmat Hidayat on 23/01/2023.
 */
object DataMapper {
    fun mapResponsesToEntities(input: List<TourismResponse>): List<TourismEntity> {
        val tourismList = ArrayList<TourismEntity>()
        input.map {
            val tourism = TourismEntity(
                tourismId = it.id,
                description = it.description,
                name = it.name,
                address = it.address,
                latitude = it.latitude,
                longitude = it.longitude,
                like = it.like,
                image = it.image,
                isFavorite = false
            )
            tourismList.add(tourism)
        }
        return tourismList
    }
}