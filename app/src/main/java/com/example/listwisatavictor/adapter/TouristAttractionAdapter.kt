package com.example.listwisatavictor.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listwisatavictor.databinding.ItemTouristAttractionsBinding
import com.example.listwisatavictor.model.TouristAttraction

class TouristAttractionAdapter(
    private val items: Array<TouristAttraction>,
    private val onSelect: (TouristAttraction) -> Unit
) :
    RecyclerView.Adapter<TouristAttractionAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemTouristAttractionsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: TouristAttraction) {
            binding.apply {
                imageTouristAttraction.setImageResource(item.image)
                tvTitle.text = item.title
                root.setOnClickListener { onSelect(item) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTouristAttractionsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
