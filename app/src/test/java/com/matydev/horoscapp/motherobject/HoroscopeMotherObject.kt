package com.matydev.horoscapp.motherobject

import com.matydev.horoscapp.data.network.response.PredictionResponse
import com.matydev.horoscapp.domain.model.Horoscope.Aquarius
import com.matydev.horoscapp.domain.model.Horoscope.Aries
import com.matydev.horoscapp.domain.model.Horoscope.Cancer
import com.matydev.horoscapp.domain.model.Horoscope.Capricorn
import com.matydev.horoscapp.domain.model.Horoscope.Gemini
import com.matydev.horoscapp.domain.model.Horoscope.Leo
import com.matydev.horoscapp.domain.model.Horoscope.Libra
import com.matydev.horoscapp.domain.model.Horoscope.Pisces
import com.matydev.horoscapp.domain.model.Horoscope.Sagittarius
import com.matydev.horoscapp.domain.model.Horoscope.Scorpio
import com.matydev.horoscapp.domain.model.Horoscope.Taurus
import com.matydev.horoscapp.domain.model.Horoscope.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}