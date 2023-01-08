package com.messenger.ui

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.messenger.data.models.User
import com.messenger.ui.screens.Routing
import com.messenger.ui.screens.account.Content
import com.messenger.ui.screens.direct.Content
import com.messenger.ui.screens.greeting.Content
import com.messenger.ui.screens.main.Content
import com.messenger.ui.screens.search.Content
import com.messenger.viewmodels.UserViewModel
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun Root() {

    val navController = rememberNavController()
    val userViewModel: UserViewModel = viewModel()
    // TODO: Добавить ViewModel пользователя

    NavHost(navController = navController, startDestination = Routing.Main.route) {
        composable(route = Routing.Greeting.route) {
            Routing.Greeting.Content()
        }

        composable(route = Routing.Authorization.route) {
            Routing.Authorization.Content(
                onLoginClick = {navController.navigate(Routing.Main.route)}
            )
        }

        composable(route = Routing.Main.route) {
            Routing.Main.Content(
                navController = navController,
                userViewModel = userViewModel,
                onSearchClick = { navController.navigate(Routing.Search.route) }
            )
        }

        composable(
            route = "${Routing.Direct.route}/{user}",
            arguments = listOf(navArgument(name = "user"){
                type = NavType.StringType
                nullable = true
            })
        ) { backStackEntry ->
            backStackEntry.arguments?.getString("user")?.let {
                val user = Json.decodeFromString<User>(it)
                Routing.Direct.Content(user = user)}
            }

        composable(route = Routing.Account.route) {
            Routing.Account.Content(

            )
        }

        composable(route = Routing.Search.route) {
            Routing.Search.Content(

            )
        }

    }


}
