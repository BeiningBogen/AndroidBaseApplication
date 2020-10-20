package com.ebb.ui.di

import com.ebb.ui.HomeFragment
import dagger.Subcomponent

@Subcomponent(modules = [HomeModule::class])
interface HomeComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): HomeComponent
    }

    fun inject(fragment: HomeFragment)
}
