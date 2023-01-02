package com.messenger.ui.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
//import androidx.compose.foundation.layout.RowScopeInstance.weight
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.messenger.data.models.Name
import com.messenger.data.models.User
import com.messenger.ui.screens.Routing
import com.messenger.ui.theme.backgroundColor
import com.messenger.viewmodels.UserViewModel

@Composable
fun Routing.Main.Content(
    userViewModel: UserViewModel,
    onChatClick: (user: User) -> Unit,
    onSearchClick:  () -> Unit
){

}

// TODO: в TopRowView добавить Box и отцентровать текст

@Composable
fun MainView(
    onChatClick: (user: User) -> Unit,
    onSearchClick:  () -> Unit,
) {
    Column(){
        TopRowView(onSearchClick)
        ChatListView(onChatClick = onChatClick, kittensList = kittens)
    }
}

@Composable
fun ChatListView(
    onChatClick: (user: User) -> Unit,
    kittensList: List<User>
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundColor)
    ){
        itemsIndexed(
            kittens
        ){ index, kitten ->
            UserBar(kitten = kitten)
        }
    }
}



@Composable
fun UserBar(kitten: User) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Text(
            text = "kitten.id",
            fontSize = 25.sp,
            color = Color.White,
            modifier = Modifier
                .background(color = Color.Transparent)
                .padding(horizontal = 15.dp)
                .fillMaxWidth()
                .height(25.dp)
        )
    }

}



@Preview
@Composable
fun MainPrev() {
    MainView(onChatClick = {}) {
    }
}

