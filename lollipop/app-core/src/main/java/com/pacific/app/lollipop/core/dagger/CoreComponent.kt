package com.pacific.app.lollipop.core.dagger

import android.app.Application
import android.content.Context
import com.pacific.app.lollipop.data.DataComponent
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        CoreModule::class,
        CoreBinder::class
    ],
    dependencies = [
        DataComponent::class
    ]
)
@AppScope
interface CoreComponent {

    fun context(): Context

    @Component.Factory
    interface Factory {

        fun create(
            dataComponent: DataComponent,
            @BindsInstance app: Application
        ): CoreComponent
    }
}