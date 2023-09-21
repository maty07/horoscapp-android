package com.matydev.horoscapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.matydev.horoscapp.R
import com.matydev.horoscapp.domain.model.Horoscope

class HoroscopeAdapter(
    private var horoscopeList: List<Horoscope> = emptyList(),
    private val onItemSelected: (Horoscope) -> Unit)
    : RecyclerView.Adapter<HoroscopeViewHolder>() {

    fun updateList(list: List<Horoscope>) {
        horoscopeList = list;
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        // cargar el layout del item recycler view
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false)
        )
    }

    override fun getItemCount(): Int = horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopeList[position], onItemSelected)
    }


}