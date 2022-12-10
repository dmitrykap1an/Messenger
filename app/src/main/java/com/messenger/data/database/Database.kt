package com.messenger.data.database

import android.content.Context
import androidx.room.Room

class Database(private val context: Context, private val databaseName: String) {

    val db = Room.databaseBuilder(context, AppDatabase::class.java, databaseName).build()
}