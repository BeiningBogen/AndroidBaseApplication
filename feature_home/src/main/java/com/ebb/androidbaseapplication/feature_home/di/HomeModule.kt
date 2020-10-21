package com.ebb.androidbaseapplication.feature_home.di

import dagger.Module

@Module
interface HomeModule {
    fun homeComponent(): HomeComponent.Factory
}
