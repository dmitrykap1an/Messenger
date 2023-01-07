package com.messenger.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.rounded.Chat
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Routing(val route: String, val label: String, val data: String){

    object Main: Routing("main", "Main", "")
    object Search: Routing("search", "Search", "")
    object Direct: Routing("direct", "Direct", "")
    object Account: Routing("account", "Account", "")
    object Greeting: Routing("greeting", "Greeting", "")
    object Authorization: Routing("authorization", "Authorization","")
}

sealed class ToolbarAction(val icon: ImageVector) {
    object NewMessage : ToolbarAction(Icons.Filled.Edit)
}