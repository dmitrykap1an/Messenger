package com.messenger.ui.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.messenger.ui.theme.backgroundColor

@Composable
fun TopRowView(
    onSearchClick:  () -> Unit
){
    Row(modifier = Modifier
        .height(55.dp)
        .fillMaxWidth()
        .background(color = backgroundColor),
        verticalAlignment = Alignment.CenterVertically,

        ){
        Text(
            "Kittygram",
            fontSize = 25.sp,
            color = Color.White,
            modifier = Modifier
                .weight(3f)
                .background(color = Color.Transparent)
                .padding(horizontal = 15.dp)
        )

        Button(
            onClick = { onSearchClick() },
            modifier = Modifier
                .weight(1f),
            colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)

        ) {
            Image(
                imageVector = Icons.Filled.Search,
                contentDescription = "search button",
                modifier = Modifier.size(200.dp, 150.dp),
                colorFilter = ColorFilter.tint(Color.White))
        }
    }
}