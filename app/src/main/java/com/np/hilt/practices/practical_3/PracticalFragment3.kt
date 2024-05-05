 package com.np.hilt.practices.practical_3

import android.os.Bundle
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.np.hilt.base_pkgs.BaseFragment
import com.np.hilt.di.DieselEngineQualifier
import com.np.hilt.practices.practical_3.utils.Car
import com.np.hilt.practices.practical_3.utils.Chassis
import com.np.hilt.practices.practical_3.utils.IEngine
import com.np.hilt.practices.practical_3.utils.Wheels
import com.np.hilt.ui.theme.HiltTheme
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PracticalFragment3: BaseFragment() {

    @Inject
    lateinit var wheels: Wheels

    @Inject
    lateinit var chassis: Chassis

    @DieselEngineQualifier
    @Inject
    lateinit var dieselEngine: IEngine

    @Inject
    lateinit var carFactory: CarFactory

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        car = carFactory.create(dieselEngine, 77, wheels, chassis)
        car.autoDrive()
    }

    @AssistedFactory
    interface CarFactory {
        fun create(
            dieselEngine: IEngine,
            @Assisted("Speed")speed: Int,
            wheels: Wheels,
            chassis: Chassis
        ): Car
    }

    @Composable
    override fun ComposeView() = View()

    @Composable
    private fun View() {
        HiltTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = "Hilt Practice 3"
                    )
                }
            }
        }
    }
}