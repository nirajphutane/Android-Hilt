package com.np.hilt.di

import javax.inject.Qualifier
import javax.inject.Scope

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class PetrolEngineQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DieselEngineQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Speed

@Scope
@Retention(AnnotationRetention.BINARY)
annotation class Scope