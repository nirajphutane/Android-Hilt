package com.np.hilt.practices.practical_2.utils

import com.np.hilt.core.appLog
import javax.inject.Inject

class Remote @Inject constructor() {

    fun start(car: Car) {
        appLog("Car ${car.hashCode()} is started by Remote(${this.hashCode()}).")
    }
}