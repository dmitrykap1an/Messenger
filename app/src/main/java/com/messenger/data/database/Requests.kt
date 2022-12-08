package com.messenger.data.database

import android.content.Context
import android.provider.BaseColumns
import com.messenger.ui.MainActivity

// TODO: переписать все под room 

fun addMessageToDatabase(id: String){
    val dbHelper: MessageDBHelper = MessageDBHelper(context, DatabaseNames.ConversationDatabase.databaseName, id )

}

object DatabaseAndColumns: BaseColumns{
    const val TABLE_NAME = "direct" // В процессе работы с определенной таблицей будет добавлять id друга(или диалога) к данному имени таблицы
    const val COLUMN_NAME_ID = "id";
    const val COLUMN_NAME_MESSAGE = "message"

}

sealed class DatabaseNames(val databaseName: String){
    object ConversationDatabase: DatabaseNames("conversation")
    object UsersDatabase: DatabaseNames("usersdatabase")
}


data class DatabaseCRUDRequests(private val id: String) {

    private val SQL_CREATE_ENTRIES = "CREATE TABLE ${DatabaseAndColumns.TABLE_NAME + id} (" +
            "${DatabaseAndColumns.COLUMN_NAME_ID} INTEGER PRIMARY KEY," +
            "${DatabaseAndColumns.COLUMN_NAME_MESSAGE} TEXT" // TODO: Сделать создание таблицы
    private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${DatabaseAndColumns.TABLE_NAME}"

    fun getCreateRequest() =
        SQL_CREATE_ENTRIES;

    fun getDeleteRequest() =
        SQL_DELETE_ENTRIES;

}

