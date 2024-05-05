package com.np.hilt.practices

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.np.hilt.base_pkgs.BaseFragment
import com.np.hilt.ui.theme.HiltTheme

class PracticeFragment: BaseFragment() {

    @Composable
    override fun ComposeView() = View()

    @Composable
    private fun View() {
        HiltTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.verticalScroll(rememberScrollState())
                ) { }
            }
        }
    }
}