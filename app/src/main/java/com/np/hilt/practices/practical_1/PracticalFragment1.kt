package com.np.hilt.practices.practical_1

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
import com.np.hilt.practices.practical_1.utils.Car
import com.np.hilt.ui.theme.HiltTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PracticalFragment1: BaseFragment() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car1: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        car.drive()

        car1.drive()
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
                        text = "Hilt Practice 1"
                    )
                }
            }
        }
    }
}