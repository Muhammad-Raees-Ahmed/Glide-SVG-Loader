package com.example.svgloader.glideUtil

import android.graphics.drawable.PictureDrawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.loadImage(url: String) {
    Glide.with(this.context)
        .`as`(PictureDrawable::class.java)
        .apply(RequestOptions().centerCrop())
        .load(url)
        .into(this)
}