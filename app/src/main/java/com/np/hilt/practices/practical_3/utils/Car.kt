package com.np.hilt.practices.practical_3.utils

import com.np.hilt.core.appLog
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import javax.inject.Inject

interface ISelfDrivingCar {
    fun autoDrive()
}

class Car @AssistedInject constructor(
    @Assisted private val engine: IEngine,
    @Assisted("Speed") private val speed: Int,
    @Assisted chassis: Chassis,
    @Assisted wheels: Wheels
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