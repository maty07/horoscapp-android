package com.matydev.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.matydev.horoscapp.data.provider.HoroscopeProvider
import com.matydev.horoscapp.domain.model.Horoscope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProvider: HoroscopeProvider): ViewModel() {

    private var _horoscope = MutableStateFlow<List<Horoscope>>(emptyList())
    val horoscope: StateFlow<List<Horoscope>> = _horoscope

    init {
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }

}