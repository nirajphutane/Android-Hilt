package com.np.hilt.practices.practical_1.utils

import com.np.hilt.core.appLog
import javax.inject.Inject

class Engine @Inject constructor() {

    fun start() {
        appLog("Engin(${this.hashCode()}) is Started.")
    }
}
