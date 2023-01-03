package com.raqamlidunyo.qashqarrubob.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.raqamlidunyo.qashqarrubob.R
import com.raqamlidunyo.qashqarrubob.ui.main.model.MainModule
import com.google.android.material.button.MaterialButton

class MainFragmentAdapter(val onItemButtonClickListener: OnItemButtonClickListener) : Adapter<MainFragmentAdapter.MainFragmentViewHolder>() {

    private val arrayList = ArrayList<MainModule>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainFragmentViewHolder {
        return MainFragmentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_main_fragment, parent,false),
            onItemButtonClickListener
        )
    }

    override fun onBindViewHolder(holder: MainFragmentViewHolder, position: Int) {
        val title = arrayList[position].title
        val image = arrayList[position].image

        val item = arrayList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    fun setList(list:List<MainModule>)
    {
        arrayList.addAll(list)
    }

    inner class MainFragmentViewHolder(itemView:View, val onItemButtonClickListener: OnItemButtonClickListener) : ViewHolder(itemView)
    {
        lateinit var materialButton:MaterialButton
        fun bind(item:MainModule)
        {
            materialButton = itemView.findViewById(R.id.item_button)
            materialButton.setText(item.title)
            materialButton.icon = AppCompatResources.getDrawable(itemView.context, item.image)
            materialButton.setOnClickListener {
                onItemButtonClickListener.onButtonClick(item, adapterPosition)
            }

        }
    }

    interface OnItemButtonClickListener{
        fun onButtonClick(gammasModule: MainModule, position: Int)
    }

}