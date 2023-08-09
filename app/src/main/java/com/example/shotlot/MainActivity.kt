package com.example.shotlot

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageButton
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.shotlot.databinding.ActivityMainBinding
import com.example.shotlot.databinding.ActivityMyActivitesBinding
import com.example.shotlot.ui.home.HomeFragment
//import androidx.fragment.app.commit
//mport androidx.fragment.app.FragmentManager
//import androidx.fragment.app.FragmentTransaction
//import kotlinx.parcelize.Parcelize

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        //supportFragmentManager.beginTransaction().replace(R.id.nav_container,UserActivitiesFragment()).commit()
        /*val fragmentA = UserActivitiesFragment()
        val transaction: FragmentManager = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragmentA)
        transaction.commit()
        fm.beginTransaction().add(R.id.mai,)
        binding.profileActivities.setOnClickListener {
            val intent = Intent(baseContext, MyActivites::class.java)
            startActivity(intent)
        }*/





        //val ActivitiesButton = findViewById<ImageButton>(R.id.profileActivities)

        profileActivities.setOnClickListener {
            val intent = Intent(baseContext, MyActivites::class.java)
            startActivity(intent)
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        /*val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_add,R.id.navigation_shop, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)*/
        navView.setupWithNavController(navController)
    }
}