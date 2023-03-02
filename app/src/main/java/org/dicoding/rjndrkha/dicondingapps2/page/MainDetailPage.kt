package org.dicoding.rjndrkha.dicondingapps2.page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.dicoding.rjndrkha.dicondingapps2.R
import org.dicoding.rjndrkha.dicondingapps2.model.Hero

class MainDetailPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "Movie Detail"

        val data = intent.getParcelableExtra<Hero>("Data")
        Log.d("Detail Data", data.toString())

        val image : ImageView = findViewById(R.id.img_item_photo)
        val tvDetailName : TextView = findViewById(R.id.tv_item_name)
        val tvDetail : TextView = findViewById(R.id.tv_item_description)
        val tvDetailtanggal : TextView = findViewById(R.id.tv_item_tanggal)
        val tvDetailGenre : TextView = findViewById(R.id.tv_item_genre)
        val tvDetailSutradara : TextView = findViewById(R.id.tv_item_sutradara)




        //image.setImageResource(data.photo)
        Glide.with(this)
            .load(data?.photo)
            .apply(RequestOptions().override(500, 600))
            .into(image)
        tvDetailName.text = data?.name
        tvDetail.text = data?.description
        tvDetailtanggal.text = data?.tanggal
        tvDetailGenre.text = data?.genre
        tvDetailSutradara.text = data?.sutradara


    }
}