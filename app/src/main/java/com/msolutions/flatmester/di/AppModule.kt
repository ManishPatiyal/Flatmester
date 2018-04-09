package com.msolutions.flatmester.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(var mApplication: Application) {

    @Provides
    @Singleton
    fun providesApplication(): Application {
        return mApplication
    }
    @Provides
    fun providesSharedPreference(): SharedPreferences {
        return mApplication.getSharedPreferences("nameOfSharedPreference", Context.MODE_PRIVATE);
    }

}