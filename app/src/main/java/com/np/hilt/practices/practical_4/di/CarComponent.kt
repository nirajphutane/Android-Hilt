package com.np.hilt.practices.practical_4.di

import com.np.hilt.di.Scope
import com.np.hilt.di.Speed
import dagger.BindsInstance
import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent

@DefineComponent(parent = SingletonComponent::class)
@Scope
interface CarComponent {

    @DefineComponent.Builder
    interface Builder {
        fun setSpeed(@Speed @BindsInstance speed: Int): Builder
        fun build(): CarComponent
    }
}