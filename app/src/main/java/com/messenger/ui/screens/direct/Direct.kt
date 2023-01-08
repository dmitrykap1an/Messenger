package com.messenger.ui.screens.direct

import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.messenger.data.models.User
import com.messenger.ui.screens.Routing

@Composable
fun Routing.Direct.Content(
    user: User?
) {
    println(user)
    Column{
        Text(
            modifier = Modifier.padding(10.dp),
            text = "Nickname: ${user?.nickname ?: "Пользователь не найден"}",
            color = Color.Black
        )
        Text(
            modifier = Modifier.padding(10.dp),
            text = "id: ${user?.id ?: 404}"
        )
    }

    // TODO: Сделать экран личных сообщений
}