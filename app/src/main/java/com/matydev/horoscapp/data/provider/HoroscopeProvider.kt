package com.matydev.horoscapp.data.provider

import com.matydev.horoscapp.domain.model.Horoscope
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
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {

    fun getHoroscopes(): List<Horoscope> {
        return listOf(
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
}