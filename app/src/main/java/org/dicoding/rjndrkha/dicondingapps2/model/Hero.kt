package org.dicoding.rjndrkha.dicondingapps2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//@Parcelize
//data class Hero(
//    val name: String,
//    val description: String,
//    val photo: Int
//) : Parcelable

//with glide
@Parcelize
data class Hero(
    var name: String,
    var description: String,
    var photo: String,
    var tanggal: String,
    var genre: String,
    var sutradara: String,
) : Parcelable