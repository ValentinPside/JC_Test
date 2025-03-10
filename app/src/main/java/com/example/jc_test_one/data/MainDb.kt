package com.example.jc_test_one.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        NameEntity::class
    ],
    version = 1
)
abstract class MainDb : RoomDatabase() {

    abstract val dao : Dao

    companion object {
        fun createDataBase(context: Context): MainDb {
            return Room.databaseBuilder(
                context,
                MainDb::class.java,
                "test.db"
            ).build()
        }
    }
}