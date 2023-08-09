package com.example.shotlot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.example.shotlot.databinding.ActivityMyActivitesBinding

class MyActivites : AppCompatActivity() {
    private lateinit var binding: ActivityMyActivitesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_activites)
        binding = ActivityMyActivitesBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}