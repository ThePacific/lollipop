package com.pacific.app.lollipop.core.dagger

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pacific.app.lollipop.core.lifecycle.NopeViewModel
import com.pacific.app.lollipop.core.lifecycle.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class CoreBinder {

    @Binds
    @AppScope
    abstract fun provideContext(it: Application): Context

    @Binds
    @AppScope
    abstract fun provideVewModelFactory(it: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NopeViewModel::class)
    abstract fun bindNopeViewModel(it: NopeViewModel): ViewModel
}