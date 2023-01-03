package com.raqamlidunyo.qashqarrubob.ui.lessons.gammas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.main.model.GammasModule
import com.google.android.material.button.MaterialButton

class GammasFragmentAdapter(val onItemButtonClickListener: OnItemButtonClickListener) : RecyclerView.Adapter<GammasFragmentAdapter.GammasFragmentViewHolder>() {

    private val arrayList = ArrayList<GammasModule>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GammasFragmentViewHolder {
        return GammasFragmentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_gammas_fragment, parent,false),
            onItemButtonClickListener
        )
    }

    override fun onBindViewHolder(holder: GammasFragmentViewHolder, position: Int) {
        val title = arrayList[position].title

        val item = arrayList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    fun setList(list:List<GammasModule>)
    {
        arrayList.addAll(list)
    }

    inner class GammasFragmentViewHolder(itemView: View, val onItemButtonClickListener: OnItemButtonClickListener) : RecyclerView.ViewHolder(itemView)
    {
        lateinit var materialButton: MaterialButton
        fun bind(item: GammasModule)
        {
            materialButton = itemView.findViewById(R.id.item_button)
            materialButton.setText(item.title)
            materialButton.setOnClickListener {
                onItemButtonClickListener.onButtonClick(item, adapterPosition)
            }

        }
    }

    interface OnItemButtonClickListener{
        fun onButtonClick(gammasModule: GammasModule, position: Int)
    }

}