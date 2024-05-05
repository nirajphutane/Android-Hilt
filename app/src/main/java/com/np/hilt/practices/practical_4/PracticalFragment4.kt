 package com.np.hilt.practices.practical_4

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
import com.np.hilt.practices.practical_4.utils.Car
import com.np.hilt.practices.practical_4.di.CarComponentProvider
import com.np.hilt.ui.theme.HiltTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PracticalFragment4: BaseFragment() {

    @Inject
    lateinit var carComponentProvider: CarComponentProvider

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        carComponentProvider.setParams(speed = 100)
        car = carComponentProvider.car
        car.autoDrive()
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
                        text = "Hilt Practice 4"
                    )
                }
            }
        }
    }
}