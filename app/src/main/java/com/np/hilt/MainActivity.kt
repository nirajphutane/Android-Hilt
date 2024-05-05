package com.np.hilt

import android.os.Bundle
import androidx.activity.viewModels
import com.np.hilt.base_pkgs.WrapperActivity
import com.np.hilt.base_pkgs.viewBinding
import com.np.hilt.databinding.ActivityMainBinding

class MainActivity : WrapperActivity() {

    private val viewModel: MainActivityViewModel by viewModels()
    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}