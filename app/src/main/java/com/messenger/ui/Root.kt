package com.messenger.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.messenger.ui.screens.Routing
import com.messenger.ui.screens.account.Content
import com.messenger.ui.screens.direct.Content
import com.messenger.ui.screens.greeting.Content
import com.messenger.ui.screens.main.Content
import com.messenger.ui.screens.search.Content
import com.messenger.viewmodels.UserViewModel

@Composable
fun Root(){

    val navController = rememberNavController()
    val userViewModel: UserViewModel = viewModel()
    // TODO: Добавить ViewModel пользователя

    NavHost(navController = navController, startDestination = Routing.Authorization.route){
        composable(route = Routing.Greeting.route){
            Routing.Greeting.Content()
        }

        composable(route = Routing.Authorization.route){
            Routing.Authorization.Content()
        }

        composable(route = Routing.Main.route){
            Routing.Main.Content(
                userViewModel = userViewModel,
                onChatClick = { navController.navigate(Routing.Direct.route) },
                onSearchClick = {navController.navigate(Routing.Search.route)}
            )
        }

        composable(route = Routing.Account.route){
            Routing.Account.Content(

            )
        }

        composable(route = Routing.Direct.route){
            Routing.Direct.Content(

            )
        }
        composable(route = Routing.Search.route){
            Routing.Search.Content(

            )
        }

    }

}