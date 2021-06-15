package com.priyanka.patel.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.priyanka.patel.R
import com.priyanka.patel.databinding.ActivityImageDetailBinding
import kotlinx.android.synthetic.main.row_list.view.*

class ImageDetailActivity : AppCompatActivity() {

    private lateinit var binding:ActivityImageDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_image_detail)

        var intent:Intent = getIntent()
        var url = intent.getStringExtra(resources.getString(R.string.IMAGE_URL))
        var thumbnailUtils = intent.getStringExtra(resources.getString(R.string.IMAGE_PLASH_HOLDER))

       var image_url= GlideUrl(url,LazyHeaders.Builder().addHeader("User-Agent","your-user-agent").build())

        Glide.with(binding.ivDataIMageDetail.context)
            .load(image_url)
            .placeholder(R.mipmap.ic_launcher)
            .into(binding.ivDataIMageDetail)

        binding.ivBack.setOnClickListener(View.OnClickListener {
            onBackPressed()
        })
    }
}