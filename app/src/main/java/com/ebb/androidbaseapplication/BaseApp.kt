package com.ebb.androidbaseapplication

import android.app.Application
import com.ebb.androidbaseapplication.di.AppComponent
import com.ebb.androidbaseapplication.di.DaggerAppComponent
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
