package com.msolutions.flatmester.repository

import com.msolutions.flatmester.database.Product
import android.arch.lifecycle.LiveData


interface ProductRepository {

    fun findById(id: Int): LiveData<Product>

    fun findAll(): LiveData<List<Product>>

    fun insert(product: Product): Long

    fun delete(product: Product): Int

}