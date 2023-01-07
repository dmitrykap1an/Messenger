package com.messenger.ui.screens.direct

import androidx.compose.animation.VectorConverter
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.messenger.data.models.User
import com.messenger.ui.screens.Routing

@Composable
fun Routing.Direct.Content(
    user: User
) {
    println(user.name)
    Text(
        text = "${user.nickname}, ${user.id}",
        color = Color.Black
    )
    // TODO: Сделать экран личных сообщений
}