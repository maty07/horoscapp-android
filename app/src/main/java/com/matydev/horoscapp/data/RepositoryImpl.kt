package com.matydev.horoscapp.data

import android.util.Log
import com.matydev.horoscapp.data.network.HoroscopeApiService
import com.matydev.horoscapp.domain.Repository
import com.matydev.horoscapp.domain.model.Prediction
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): Prediction? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("maty", "Error: ${it.message}") }

        return null
    }
}