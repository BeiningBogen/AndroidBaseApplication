package com.ebb.androidbaseapplication.di

import com.ebb.androidbaseapplication.di.annotations.AppScope
import com.ebb.ui.di.HomeComponent
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun homeComponent(): HomeComponent.Factory

    // fun inject(mainActivity: MainActivity)
    // fun inject(fragment: HomeFragment)
}
