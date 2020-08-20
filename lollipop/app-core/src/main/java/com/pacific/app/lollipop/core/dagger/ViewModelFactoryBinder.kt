package com.pacific.app.lollipop.core.dagger

import androidx.lifecycle.ViewModelProvider
import com.pacific.app.lollipop.core.lifecycle.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryBinder {

    @Binds
    @FeatureScope
    abstract fun provideViewModelFactory(it: ViewModelFactory): ViewModelProvider.Factory
}