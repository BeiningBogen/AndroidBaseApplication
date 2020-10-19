package com.ebb.androidbaseapplication.di

import android.content.Context
import com.ebb.androidbaseapplication.di.annotations.AppScope
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val applicationContext: Context) {
    @Provides
    @AppScope
    fun provideApplicationContext(): Context = applicationContext
}

