package com.example.habitwith

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AlimentoAdapter(private var listas: List<Alimentos>) : RecyclerView.Adapter<AlimentoAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(lista: Alimentos) {
            itemView.setOnClickListener{

                println("item pulsado")

            }
            itemView.findViewById<TextView>(R.id.tvBarCode).text = lista.code
            itemView.findViewById<TextView>(R.id.tvNombre).text = lista.generic_name
            itemView.findViewById<TextView>(R.id.tvAlergenos).text = lista.allergens
            Glide.with(itemView.context)
                .load(lista.image_front_url)
                .into(itemView.findViewById<ImageView>(R.id.ivMain))
        }

    }
    fun setList(lista2:MutableList<Alimentos>){
        this.listas = lista2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_manus, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listas[position])


    }

    override fun getItemCount() = listas.size
}