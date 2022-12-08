package com.messenger.ui.screens.main

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.messenger.data.models.User
import com.messenger.ui.screens.Routing
import com.messenger.viewmodels.UserViewModel

@Composable
fun Routing.Main.Content(
    userViewModel: UserViewModel,
    onChatClick: (user: User) -> Unit,
    onSearchClick:  () -> Unit
){
    // TODO: Сделать экран с диалогами 
}