package com.chuanxi.hellokotlin.domain

/**
 * Created by tangjunjie on 2016/2/19.
 */
data class ForecastList(val id: Long, val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {
    fun get(position:Int) = dailyForecast[position]
    fun size() = dailyForecast.size
}

data class Forecast(val id: Long, val date: Long, val description: String, val high: Int,
                    val low: Int, val iconUrl: String)