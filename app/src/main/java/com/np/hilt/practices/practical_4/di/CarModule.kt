package com.np.hilt.practices.practical_4.di

import com.np.hilt.practices.practical_4.utils.Car
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@InstallIn(CarComponent::class)
interface CarModule {

    fun bindCar(): Car
}