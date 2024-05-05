package com.np.hilt.practices.practical_2.di

import com.np.hilt.di.DieselEngineQualifier
import com.np.hilt.di.PetrolEngineQualifier
import com.np.hilt.practices.practical_2.utils.DieselEngine
import com.np.hilt.practices.practical_2.utils.IEngine
import com.np.hilt.practices.practical_2.utils.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class PetrolEngineModule {

    @PetrolEngineQualifier
    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine): IEngine
}

@Module
@InstallIn(SingletonComponent::class, ActivityComponent::class)
class DieselEngineModule {

    @DieselEngineQualifier
    @Provides
    fun provideDieselEngine(): IEngine = DieselEngine()
}