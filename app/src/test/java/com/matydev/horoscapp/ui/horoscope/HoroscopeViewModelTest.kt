package com.matydev.horoscapp.ui.horoscope

import com.matydev.horoscapp.data.provider.HoroscopeProvider
import com.matydev.horoscapp.motherobject.HoroscopeMotherObject
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest {

    @MockK(relaxed = true)
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewmodel is created then horoscopes are loaded`() {

        every { horoscopeProvider.getHoroscopes() } returns HoroscopeMotherObject.horoscopeList

        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())


    }
}