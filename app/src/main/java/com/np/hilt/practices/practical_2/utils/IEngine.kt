package com.np.hilt.practices.practical_2.utils

import com.np.hilt.core.appLog
import javax.inject.Inject


interface IEngine {

    fun start()
}
class PetrolEngine @Inject constructor() : IEngine  {

    override fun start() {
        appLog("PetrolEngine(${this.hashCode()}) is Started.")
    }
}

class DieselEngine : IEngine  {

    override fun start() {
        appLog("DieselEngine(${this.hashCode()}) is Started.")
    }
}