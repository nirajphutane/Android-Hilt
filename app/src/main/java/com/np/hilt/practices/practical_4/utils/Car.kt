package com.np.hilt.practices.practical_4.utils

import com.np.hilt.core.appLog
import com.np.hilt.di.DieselEngineQualifier
import com.np.hilt.di.Scope
import com.np.hilt.di.Speed
import javax.inject.Inject

interface ISelfDrivingCar {
    fun autoDrive()
}

@Scope
class Car @Inject constructor(
    @DieselEngineQualifier private val engine: IEngine,
    @Speed private val speed: Int,
    chassis: Chassis,
    wheels: Wheels
) : ISelfDrivingCar {

    init {
        appLog("Self Driving Car(${this.hashCode()}) created")
    }

    // Method Injection
    @Inject
    fun startByRemote(remote: Remote) {
        remote.start(this)
        engine.start()
    }

    override fun autoDrive() {
        appLog("Self Driving Car(${this.hashCode()}) is running with $speed KM/Hr.")
    }
}