package com.messenger.data.models

import android.os.Parcel
import android.os.Parcelable
import com.se7en.messenger.R
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
data class User(
    val id: Long,
    val nickname: String,
    val name: Name,
    val lastMessage: String,
    val picture: Int? = R.drawable.pupin // TODO: сделать аватарку пользователя подэфолту
): Parcelable

@Parcelize
data class Name(
    val firstName: String,
    val lastName: String
): Parcelable