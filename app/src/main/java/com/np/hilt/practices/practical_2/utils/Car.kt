package com.np.hilt.practices.practical_2.utils

import android.content.Context
import com.np.hilt.core.appLog
import com.np.hilt.di.DieselEngineQualifier
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

// Constructor Injection
class Car @Inject constructor(
    @ApplicationContext applicationContext: Context,
    @ActivityContext activityContext: Context,
    @DieselEngineQualifier private val engine: IEngine,
    chassis: Chassis,
    wheels: Wheels
) {

    init {
        appLog("Application Context: ${applicationContext.hashCode()}")
        appLog("Activity Context: ${activityContext.hashCode()}")
        appLog("Car(${this.hashCode()}) created")
    }

    // Method Injection
    @Inject
    fun startByRemote(remote: Remote) {
        remote.start(this)
        engine.start()
    }

    fun drive() = appLog("Car(${this.hashCode()}) is running.")
}