package com.messenger.data.models.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Message(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "receiver_id") val id: String,
    @ColumnInfo(name = "message") val message: String
)