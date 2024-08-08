package com.example.navigationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    private lateinit var navigationController: NavController //navigasyon kontrollerini yapmmaızı sağlıyor.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //navigationController = Navigation.findNavController(this,R.id.fragmentContainerView)
        //NavigationUI.setupActionBarWithNavController(this,navigationController)
    }

    /*override fun onSupportNavigateUp(): Boolean { //kullanıcı uygulamada başka bir yere navigate yaptığında çağrılıyormuş.
        return NavigationUI.navigateUp(navigationController,null)
    }*/
}