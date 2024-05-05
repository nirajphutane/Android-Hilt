package com.np.hilt.practices.practical_1.utils

import com.np.hilt.core.appLog
import javax.inject.Inject

// Constructor Injection
class Car @Inject constructor(private val engine: Engine, chassis: Chassis, wheels: Wheels) {

    init {
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