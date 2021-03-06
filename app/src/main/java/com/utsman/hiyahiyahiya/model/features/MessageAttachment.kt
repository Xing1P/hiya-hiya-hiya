package com.utsman.hiyahiyahiya.model.features

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.utsman.hiyahiyahiya.model.features.ImageBBSimple
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ImageAttachment(
    @SerializedName("image_b_b_simple")
    var imageBBSimple: ImageBBSimple? = null
): Parcelable

@Parcelize
data class UrlAttachment(
    var url: String? = "",
    var image: String? = "",
    var title: String? = "",
    var subtitle: String? = ""
): Parcelable