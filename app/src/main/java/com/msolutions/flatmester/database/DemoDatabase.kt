package com.msolutions.flatmester.database


import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Product::class), version = DemoDatabase.VERSION)
abstract class DemoDatabase : RoomDatabase() {

    abstract val productDao: ProductDao

    companion object {

         const val VERSION = 1
    }

}