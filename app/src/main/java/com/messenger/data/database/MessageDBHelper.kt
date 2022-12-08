package com.messenger.data.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MessageDBHelper(context: Context, databaseName: String, id: String):
    SQLiteOpenHelper(context, databaseName, null, DATABASE_VERSION, ){

    private val crud = DatabaseCRUDRequests(id);

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(crud.getCreateRequest())
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL(crud.getDeleteRequest())
        onCreate(db)
    }

    companion object{
        const val DATABASE_VERSION = 1
    }


}