package com.ebb.androidbaseapplication.app.di

import com.ebb.androidbaseapplication.app.di.annotations.AppScope
import com.ebb.androidbaseapplication.feature_home.di.HomeComponent
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun homeComponent(): HomeComponent.Factory

    // fun inject(mainActivity: MainActivity)
    // fun inject(fragment: HomeFragment)
}
