package com.example.aisle.presenter.views

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.request.RequestOptions
import com.example.aisle.R
import com.example.aisle.databinding.ActivityMainBinding
import com.example.aisle.presenter.viewModel.MainViewModel
import com.example.aisle.utils.Constants.TOKEN
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.glide.transformations.BlurTransformation
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        navController = navHostFragment.navController
        val navView = binding.navView
        navView.setupWithNavController(navController)

        viewModel.setToken(intent.getStringExtra(TOKEN).toString())
        Log.d(TAG, "onCreate: ${viewModel.getToken()}")



    }

    companion object{
        private val TAG: String? = MainActivity::class.java.simpleName
    }
}