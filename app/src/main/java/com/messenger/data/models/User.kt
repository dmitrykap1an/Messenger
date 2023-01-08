package com.messenger.data.models

import android.os.Parcel
import android.os.Parcelable
import com.se7en.messenger.R
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class User(
    val id: Long,
    val nickname: String,
    val name: Name,
    @Transient
    val lastMessage: String = "",
    val picture: Int = R.drawable.pupin // TODO: сделать аватарку пользователя подэфолту
)

@Serializable
data class Name(
    val firstName: String,
    val lastName: String
)