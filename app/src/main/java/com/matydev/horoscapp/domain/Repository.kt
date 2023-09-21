package com.matydev.horoscapp.domain

import com.matydev.horoscapp.domain.model.Prediction


interface Repository {

    suspend fun getPrediction(sign: String): Prediction?

}