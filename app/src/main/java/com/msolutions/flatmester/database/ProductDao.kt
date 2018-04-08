package com.msolutions.flatmester.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*


@Dao
interface ProductDao {

    @Query("SELECT * FROM Product WHERE id=:id")
    fun findById(id: Int): LiveData<Product>

    @Query("SELECT * FROM Product")
    fun findAll(): LiveData<List<Product>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(product: Product): Long

    @Delete
    fun delete(product: Product): Int

}