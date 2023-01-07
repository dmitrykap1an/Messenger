package com.messenger.data.models

import com.se7en.messenger.R


data class User(
    val id: String,
    val nickname: String,
    val name: Name,
    val lastMessage: String,
    val picture: Int? = R.drawable.pupin // TODO: сделать аватарку пользователя подэфолту
)

data class Name(
    val firstName: String,
    val lastName: String
)