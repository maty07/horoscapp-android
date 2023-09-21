package com.matydev.horoscapp.domain.model

import com.matydev.horoscapp.R

sealed class Horoscope(val img: Int, val name: Int) {
    data object Aries:Horoscope(R.drawable.aries, R.string.aries)
    data object Taurus: Horoscope(R.drawable.tauro, R.string.taurus)
    data object Gemini: Horoscope(R.drawable.geminis, R.string.gemini)
    data object Cancer: Horoscope(R.drawable.cancer, R.string.cancer)
    data object Leo: Horoscope(R.drawable.leo, R.string.leo)
    data object Virgo: Horoscope(R.drawable.virgo, R.string.virgo)
    data object Libra: Horoscope(R.drawable.libra, R.string.libra)
    data object Scorpio: Horoscope(R.drawable.escorpio, R.string.scorpio)
    data object Sagittarius: Horoscope(R.drawable.sagitario, R.string.sagittarius)
    data object Capricorn: Horoscope(R.drawable.capricornio, R.string.capricorn)
    data object Aquarius: Horoscope(R.drawable.aquario, R.string.aquarius)
    data object Pisces: Horoscope(R.drawable.piscis, R.string.pisces)

}