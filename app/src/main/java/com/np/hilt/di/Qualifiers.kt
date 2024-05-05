package com.np.hilt.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class PetrolEngineQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DieselEngineQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Speed