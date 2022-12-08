package com.messenger.data.models

import com.se7en.messenger.R


data class User(
    val id: String,
    val name: Name,
    val picture: Int? = R.drawable.alien // TODO: сделать аватарку пользователя подэфолту
)

data class Name(
    val firstName: String,
    val lastName: String
)