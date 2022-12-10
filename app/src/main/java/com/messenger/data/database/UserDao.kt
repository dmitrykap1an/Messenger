package com.messenger.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.messenger.data.models.entities.Message

@Dao
interface MessageDao {

    @Query("SELECT * FROM message")
    fun getAll(): List<Message>

    @Query("SELECT * FROM message WHERE receiver_id LIKE :id")
    fun findById(id: String): List<Message>

    @Insert
    fun insertAll(vararg messages: Message)

    @Delete
    fun delete(messages: Message)

}