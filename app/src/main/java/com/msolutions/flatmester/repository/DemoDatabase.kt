package com.msolutions.flatmester.repository

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.msolutions.flatmester.database.Product
import com.msolutions.flatmester.database.ProductDao


@Database(entities = arrayOf(Product::class), version = DemoDatabase.VERSION)
abstract class DemoDatabase : RoomDatabase() {

    abstract val productDao: ProductDao

    companion object {

        internal const val VERSION = 1
    }

}