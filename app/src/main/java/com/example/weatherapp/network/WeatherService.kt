package com.example.weatherapp.network

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call
import com.example.weatherapp.models.WeatherResponse

interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
            @Query("lat")lat:Double,
            @Query("lon")lon:Double,
            @Query("appid")appid:String,
            @Query("units")units:String?
    ) : Call<WeatherResponse>
}