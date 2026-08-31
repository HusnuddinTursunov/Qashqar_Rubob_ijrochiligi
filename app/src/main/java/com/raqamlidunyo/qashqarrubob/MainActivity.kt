package com.raqamlidunyo.qashqarrubob

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
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

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        appBarLayout = findViewById(R.id.app_bar_id)
        toolbar = findViewById<Toolbar>(R.id.toolbar)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.main_nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(toolbar,navController)
        navController.addOnDestinationChangedListener(this)
        applyWindowInsets()
    }



    /**
     * Android 15+ (targetSdk 35) da ilova "edge-to-edge" rejimda ochiladi.
     * Tizim panellari (status bar / navigation bar) balandligini root layoutga
     * padding qilib beramiz, aks holda kontent ular ostida qolib ketadi.
     */
    private fun applyWindowInsets() {
        val root = findViewById<View>(R.id.root_layout)

        // Status bar belgilari (soat, batareya) och rangda bo'lsin — fon to'q jigarrang
        WindowCompat.getInsetsController(window, root).isAppearanceLightStatusBars = false

        ViewCompat.setOnApplyWindowInsetsListener(root) { v, insets ->
            val bars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            v.updatePadding(
                left = bars.left,
                top = bars.top,
                right = bars.right,
                bottom = bars.bottom
            )
            insets
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