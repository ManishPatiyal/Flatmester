package com.msolutions.flatmester.di

import android.app.Application
import android.content.SharedPreferences
import com.msolutions.flatmester.DashboardActivity
import com.msolutions.flatmester.database.ProductDao
import com.msolutions.flatmester.repository.DemoDatabase
import com.msolutions.flatmester.repository.ProductRepository
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(dependencies = [], modules = [(AppModule::class), (RoomModule::class)])
interface FlatMesterComponent {

    fun inject(dashboardActivity: DashboardActivity)

    fun productDao(): ProductDao

    fun demoDatabase(): DemoDatabase

    fun productRepository(): ProductRepository

    fun application(): Application

    fun sharedPreference(): SharedPreferences

}