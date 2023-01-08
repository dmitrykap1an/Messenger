package com.messenger.ui.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.messenger.data.models.User
import com.messenger.ui.screens.Routing
import com.messenger.ui.test.kittens
import com.messenger.ui.theme.backgroundColor
import com.messenger.ui.theme.messageBarBackgroundColor
import com.messenger.viewmodels.UserViewModel
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement

@Composable
fun Routing.Main.Content(
    navController: NavController,
    userViewModel: UserViewModel,
    onSearchClick: () -> Unit,
) {
    Column() {
        TopRowView(onSearchClick)
        ChatListView(usersList = kittens, navController = navController)
    }
}

@Composable
fun ChatListView(
    usersList: List<User>,
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundColor)
    ) {
        for (user in usersList) {
            item {
                ChatBar(user = user, navController = navController)
            }
        }
    }
}


@Composable
fun ChatBar(user: User, navController: NavController) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp,
    ) {
        Box(
            Modifier
                .background(color = messageBarBackgroundColor)
                .clickable(onClick = {
                    val json = Json.encodeToJsonElement(user)
                    navController.navigate("${Routing.Direct.route}/${json}")
                })
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .padding(8.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                    ,
                    painter = painterResource(id = user.picture!!),
                    contentScale = ContentScale.Crop,
                    contentDescription = "avatar"
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(
                        text = user.nickname,
                        color = Color.White,
                        fontSize = 17.sp
                    )
                    Text(
                        text = user.lastMessage,
                        color = Color.Gray
                    )
                }
            }

        }
    }


}


@Preview
@Composable
fun MainContentPreview() {
    Routing.Main.Content(
        navController = rememberNavController(),
        onSearchClick = {},
        userViewModel = viewModel()
    )
}

