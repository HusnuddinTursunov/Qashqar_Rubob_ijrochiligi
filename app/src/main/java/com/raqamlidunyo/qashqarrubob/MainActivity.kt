package com.raqamlidunyo.qashqarrubob

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.appbar.AppBarLayout


class MainActivity : AppCompatActivity(), NavController.OnDestinationChangedListener {

    private lateinit var toolbar: Toolbar
    private lateinit var appBarLayout: AppBarLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        appBarLayout = findViewById(R.id.app_bar_id)
        toolbar = findViewById<Toolbar>(R.id.toolbar)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.main_nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(toolbar,navController)
        navController.addOnDestinationChangedListener(this)
        changeStatusBarColor()
    }



    protected fun changeStatusBarColor() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS)

            window.statusBarColor = ContextCompat.getColor(this, R.color.brown_dark_bg)

        } else {
            @Suppress("DEPRECATION")
            window.decorView.systemUiVisibility = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                0 or 0
            } else {
                View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            }
            window.statusBarColor = ContextCompat.getColor(this, R.color.brown_dark_bg)

        }
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {


        if (destination.id == R.id.splashFragment)
        {
            toolbar.visibility = View.GONE
            appBarLayout.elevation = 0f
        }

        else if (destination.id == R.id.mainFragment)
        {
            toolbar.visibility = View.GONE
            appBarLayout.elevation = 0f
            appBarLayout.visibility = View.GONE
        }
        else if (destination.id == R.id.historyFragment)
        {
            appBarLayout.visibility = View.VISIBLE
            appBarLayout.elevation = 20f
            toolbar.visibility = View.VISIBLE
        }
        else if (destination.id == R.id.rulesFragment)
        {
            appBarLayout.visibility = View.VISIBLE
            toolbar.visibility = View.VISIBLE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.mediatorFragment)
        {
            appBarLayout.visibility = View.GONE
            toolbar.visibility = View.GONE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.soundsLocationFragment)
        {
            toolbar.visibility = View.GONE
            appBarLayout.visibility = View.GONE
        }

        else if (destination.id == R.id.gammasFragment)
        {
            appBarLayout.visibility = View.VISIBLE
            toolbar.visibility = View.VISIBLE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.helpersFragment)
        {
            toolbar.visibility = View.GONE
            appBarLayout.visibility = View.GONE
        }

        else if (destination.id == R.id.usageFragment)
        {
            appBarLayout.visibility = View.VISIBLE
            toolbar.visibility = View.VISIBLE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.authorFragment)
        {
            appBarLayout.visibility = View.VISIBLE
            toolbar.visibility = View.VISIBLE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.songsFragment)
        {
            appBarLayout.visibility = View.VISIBLE
            toolbar.visibility = View.VISIBLE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.paxtaoyFragment)
        {
            appBarLayout.visibility = View.GONE
            toolbar.visibility = View.GONE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.dolonchaFragment)
        {
            appBarLayout.visibility = View.GONE
            toolbar.visibility = View.GONE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.andijonPolkaFragment)
        {
            appBarLayout.visibility = View.GONE
            toolbar.visibility = View.GONE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.qashqarchaFragment)
        {
            appBarLayout.visibility = View.GONE
            toolbar.visibility = View.GONE
            appBarLayout.elevation = 20f
        }

        else if (destination.id == R.id.yallanmaYorimFragment)
        {
            appBarLayout.visibility = View.GONE
            toolbar.visibility = View.GONE
            appBarLayout.elevation = 20f
        }


    }


}