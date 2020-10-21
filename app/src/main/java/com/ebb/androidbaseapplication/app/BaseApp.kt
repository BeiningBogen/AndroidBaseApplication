package com.ebb.androidbaseapplication.app

import android.app.Application
import com.ebb.androidbaseapplication.BuildConfig
import com.ebb.androidbaseapplication.app.di.AppComponent
import com.ebb.androidbaseapplication.app.di.DaggerAppComponent
import timber.log.Timber

class BaseApp : Application() {
    val appComponent: AppComponent = DaggerAppComponent.builder().build()

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
