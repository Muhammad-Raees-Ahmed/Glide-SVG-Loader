package com.example.svgloader.glideUtil


import android.graphics.Picture
import android.graphics.drawable.PictureDrawable
import com.bumptech.glide.load.engine.Resource
import com.bumptech.glide.load.resource.SimpleResource
import com.bumptech.glide.load.Options
import com.bumptech.glide.load.ResourceDecoder
import com.caverock.androidsvg.SVG
import java.io.InputStream

class SvgDecoder : ResourceDecoder<InputStream, SVG> {
    override fun handles(source: InputStream, options: Options): Boolean {
        return true
    }

    override fun decode(source: InputStream, width: Int, height: Int, options: Options): Resource<SVG>? {
        return try {
            val svg = SVG.getFromInputStream(source)
            SimpleResource(svg)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
