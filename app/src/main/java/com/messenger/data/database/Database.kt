package com.messenger.data.database

import android.content.Context
import androidx.compose.ui.platform.LocalContext
import androidx.room.Room

class Database(private val context: Context, private val databaseName: String) {
    //val localContext = LocalContext.current
    val db = Room.databaseBuilder(context, AppDatabase::class.java, databaseName).build()
}