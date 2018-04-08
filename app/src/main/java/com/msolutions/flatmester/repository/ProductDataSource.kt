package com.msolutions.flatmester.repository

import android.arch.lifecycle.LiveData
import com.msolutions.flatmester.database.Product
import com.msolutions.flatmester.database.ProductDao
import javax.inject.Inject


class ProductDataSource @Inject
constructor(private val productDao: ProductDao) : ProductRepository {

    override fun findById(id: Int): LiveData<Product> {
        return productDao.findById(id)
    }

    override fun findAll(): LiveData<List<Product>> {
        return productDao.findAll()
    }

    override fun insert(product: Product): Long {
        return productDao.insert(product)
    }

    override fun delete(product: Product): Int {
        return productDao.delete(product)
    }
}