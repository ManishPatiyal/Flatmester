package com.msolutions.flatmester.di

import com.msolutions.flatmester.repository.ProductDataSource
import com.msolutions.flatmester.database.ProductDao
import com.msolutions.flatmester.repository.ProductRepository
import dagger.Provides
import javax.inject.Singleton
import com.msolutions.flatmester.database.DemoDatabase
import android.arch.persistence.room.Room
import android.app.Application
import dagger.Module


@Module
class RoomModule(mApplication: Application) {

    private val demoDatabase: DemoDatabase = Room.databaseBuilder(mApplication, DemoDatabase::class.java, "demo-db").build()

    @Singleton
    @Provides
    fun providesRoomDatabase(): DemoDatabase {
        return demoDatabase
    }

    @Singleton
    @Provides
    fun providesProductDao(demoDatabase: DemoDatabase): ProductDao {
        return demoDatabase.productDao
    }

    @Singleton
    @Provides
    fun productRepository(productDao: ProductDao): ProductRepository {
        return ProductDataSource(productDao)
    }

}