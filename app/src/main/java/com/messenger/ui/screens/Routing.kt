package com.messenger.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.rounded.Chat
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Routing(val route: String, val label: String){

    object Main: Routing("main", "Main"){

        val bottomNavRoutings = listOf(BottomNav.Chats)

        sealed class BottomNav(
            val route: String,
            val label: String,
            val icon: ImageVector,
            val actions: List<ToolbarAction>
        ){
            object Chats: BottomNav(
                route = "chats",
                label= "Chats",
                icon = Icons.Rounded.Chat,
                actions = listOf(ToolbarAction.NewMessage)
            )
        }
    }
    object Search: Routing("search", "Search")
    object Direct: Routing("direct", "Direct")
    object Account: Routing("account", "Account")
    object Greeting: Routing("greeting", "Greeting")
}

sealed class ToolbarAction(val icon: ImageVector) {
    object NewMessage : ToolbarAction(Icons.Filled.Edit)
}