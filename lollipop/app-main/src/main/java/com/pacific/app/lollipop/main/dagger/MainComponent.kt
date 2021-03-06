package com.pacific.app.lollipop.main.dagger

import com.pacific.app.lollipop.core.dagger.CoreComponent
import com.pacific.app.lollipop.core.dagger.FeatureScope
import com.pacific.app.lollipop.core.dagger.ViewModelFactoryComponent
import com.pacific.app.lollipop.data.DataComponent
import dagger.Component

@Component(
    modules = [
        MainBinder::class
    ],
    dependencies = [
        DataComponent::class,
        CoreComponent::class
    ]
)
@FeatureScope
interface MainComponent : ViewModelFactoryComponent {

    @Component.Factory
    interface Factory {

        fun create(
            dataComponent: DataComponent,
            coreComponent: CoreComponent
        ): MainComponent
    }
}