package com.muhammedkursat.highlevelnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
class MainActivity : AppCompatActivity() {
    private lateinit var navigationController : NavController
//    val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//    var navController = navHostFragment.navController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
    navigationController = navHostFragment.navController
    //navigationController = Navigation.findNavController(this,R.id.fragmentContainerView)
    NavigationUI.setupActionBarWithNavController(this,navigationController)

    }
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navigationController,null)
    }

}