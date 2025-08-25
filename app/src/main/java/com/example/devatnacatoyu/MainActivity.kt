package com.example.devatnacatoyu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devatnacatoyu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragment = CalculatorFragment()
        supportFragmentManager.beginTransaction()
            .add(binding.fragmentContainerView, fragment, null)
            .commit()
    }
}
