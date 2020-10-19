package com.ebb.androidbaseapplication.di

import com.ebb.androidbaseapplication.di.annotations.AppScope
import com.ebb.androidbaseapplication.main.MainActivity
import com.ebb.androidbaseapplication.main.MainFragment
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])

interface AppComponent {
    fun inject(mainActivity: MainActivity)

    fun inject(fragment: MainFragment)
}
