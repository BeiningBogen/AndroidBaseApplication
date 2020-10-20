package com.ebb.ui.di

import dagger.Module

@Module
interface HomeModule {
    fun homeComponent(): HomeComponent.Factory
}
