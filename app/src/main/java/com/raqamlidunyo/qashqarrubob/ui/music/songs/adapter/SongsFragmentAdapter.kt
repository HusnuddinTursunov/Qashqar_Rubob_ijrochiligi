package com.raqamlidunyo.qashqarrubob.ui.music.songs.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.music.songs.model.Songs
import com.google.android.material.button.MaterialButton

class SongsFragmentAdapter(val onItemButtonClickListener: SongsFragmentAdapter.OnItemButtonClickListener) : RecyclerView.Adapter<SongsFragmentAdapter.SongsFragmentViewHolder>() {

    private val arrayList = ArrayList<Songs>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsFragmentAdapter.SongsFragmentViewHolder {
        return SongsFragmentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_gammas_fragment, parent,false),
            onItemButtonClickListener
        )
    }

    override fun onBindViewHolder(holder: SongsFragmentAdapter.SongsFragmentViewHolder, position: Int) {
        val title = arrayList[position].title

        val item = arrayList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    fun setList(list:List<Songs>)
    {
        arrayList.addAll(list)
    }
    inner class SongsFragmentViewHolder(itemView: View, val onItemButtonClickListener: OnItemButtonClickListener) : RecyclerView.ViewHolder(itemView)
    {
        lateinit var materialButton: MaterialButton
        fun bind(item: Songs)
        {
            materialButton = itemView.findViewById(R.id.item_button)
            materialButton.setText(item.title)
            materialButton.setOnClickListener {
                onItemButtonClickListener.onButtonClick(item, adapterPosition)
            }

        }
    }

    interface OnItemButtonClickListener{
        fun onButtonClick(songs: Songs, position: Int)
    }
}