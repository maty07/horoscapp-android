package com.matydev.horoscapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.matydev.horoscapp.domain.model.Prediction

data class PredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("sign") val sign: String,
    @SerializedName("horoscope") val horoscope: String,
) {
    fun toDomain(): Prediction {
        return Prediction(
            horoscope = horoscope,
            sign = sign
        )
    }
}