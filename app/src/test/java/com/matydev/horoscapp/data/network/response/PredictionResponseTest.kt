package com.matydev.horoscapp.data.network.response

import com.matydev.horoscapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test


class PredictionResponseTest {
    @Test
    fun `toDomain should return a correct PredictionModel`() {
        // given
        val predictionResponse = anyResponse.copy(sign = "Aries")
        // when
        val predictionModel = predictionResponse.toDomain()

        //then
        predictionModel.sign shouldBe  predictionResponse.sign
        predictionModel.horoscope shouldBe  predictionResponse.horoscope

    }
}