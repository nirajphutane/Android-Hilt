package com.np.hilt.practices.practical_4.di

import com.np.hilt.practices.practical_4.utils.Car
import dagger.hilt.EntryPoints
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject
import javax.inject.Provider

@ActivityRetainedScoped
class CarComponentProvider @Inject constructor(
    private val carComponentProvider: Provider<CarComponent.Builder>
) {
    lateinit var car: Car
        private set

    fun setParams(speed: Int) {
        val carComponent = carComponentProvider
            .get()
            .setSpeed(speed)
            .build()
        car = EntryPoints.get(
            carComponent,
            CarModule::class.java
        ).bindCar()
    }
}