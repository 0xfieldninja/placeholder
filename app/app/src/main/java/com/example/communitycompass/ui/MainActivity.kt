package com.example.communitycompass.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.communitycompass.R
import com.example.communitycompass.databinding.ActivityMainBinding
import com.example.communitycompass.ui.map.MapFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MapFragment.newInstance())
                .commitNow()
        }
    }
}
