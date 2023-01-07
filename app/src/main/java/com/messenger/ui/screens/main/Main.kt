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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.messenger.data.models.User
import com.messenger.ui.screens.Routing
import com.messenger.ui.theme.backgroundColor
import com.messenger.ui.theme.messageBarBackgroundColor
import com.messenger.viewmodels.UserViewModel

@Composable
fun Routing.Main.Content(
    userViewModel: UserViewModel,
    onChatClick: (user: User) -> Unit,
    onSearchClick: () -> Unit,
) {
    Column() {
        TopRowView(onSearchClick)
        ChatListView(onChatClick = onChatClick, usersList = kittens)
    }
}

@Composable
fun ChatListView(
    onChatClick: (user: User) -> Unit,
    usersList: List<User>
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundColor)
    ) {
        for (user in usersList) {
            item {
                ChatBar(user = user, onChatClick)
            }
        }
    }
}


@Composable
fun ChatBar(user: User, onChatClick: (user: User) -> Unit) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp,
    ) {
        Box(
            Modifier.background(color = messageBarBackgroundColor).clickable(onClick = { onChatClick(user) })
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
    Routing.Main.Content(onChatClick = {}, onSearchClick = {}, userViewModel = viewModel())
}

