package com.demoexample.observer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.demoexample.observer.databinding.ActivityMain2Binding
import com.demoexample.observer.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            Log.d("MainActivity","MainActivity")
            startActivity(intent)
        }
    }
}