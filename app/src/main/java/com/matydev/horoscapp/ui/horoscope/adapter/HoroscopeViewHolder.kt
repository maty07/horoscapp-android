package com.matydev.horoscapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.matydev.horoscapp.databinding.ItemHoroscopeBinding
import com.matydev.horoscapp.domain.model.Horoscope

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscope: Horoscope, onItemSelected: (Horoscope) -> Unit) {
        binding.ivHoroscope.setImageResource(horoscope.img)
        binding.tvTitle.text = binding.tvTitle.context.getString(horoscope.name)

        binding.parent.setOnClickListener {
            startRotationAnimation(binding.ivHoroscope, newLambda = {onItemSelected(horoscope)})
        }
    }

    private fun startRotationAnimation(view: View, newLambda: () -> Unit) {
        view.animate().apply {
            duration = 300
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { newLambda() }
            start()
        }
    }

}