package com.messenger.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.messenger.data.models.entities.Message

@Database(entities = [Message::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun messageDao() : MessageDao
}