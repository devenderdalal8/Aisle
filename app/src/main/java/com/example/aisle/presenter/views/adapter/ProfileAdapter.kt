package com.example.aisle.presenter.views.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.request.RequestOptions
import com.example.aisle.data.model.AvatarProfiles
import com.example.aisle.databinding.ItemProfileBinding
import jp.wasabeef.glide.transformations.BlurTransformation
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class ProfileAdapter constructor(var data: ObservableArrayList<AvatarProfiles>) :
    RecyclerView.Adapter<ProfileViewHolder>() {
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        context = parent.context
        return ProfileViewHolder(
            ItemProfileBinding.inflate(
                LayoutInflater.from(context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val offer = data[position]

        holder.bind(offer, context)
    }

}

class ProfileViewHolder(private val binding: ItemProfileBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(data: AvatarProfiles, context: Context) {
        val multi = MultiTransformation(
            BlurTransformation(50),
            RoundedCornersTransformation(16, 0, RoundedCornersTransformation.CornerType.BOTTOM)
        )
        binding.apply {
            Glide.with(context).load(data.avatar)
                .apply(RequestOptions.bitmapTransform(multi))
                .into(ivProfile)

            tvName.text = data.firstName
        }

    }

}