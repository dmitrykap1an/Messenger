package com.messenger.navigation

import androidx.navigation.NavController
import com.messenger.data.models.User
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*


inline fun <reified T> navigateModel(route: String, id: T, navController: NavController) {
    navController.navigate("$route/$id")
}