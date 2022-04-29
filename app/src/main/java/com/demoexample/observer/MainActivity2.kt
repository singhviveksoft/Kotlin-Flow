package com.demoexample.observer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.demoexample.observer.databinding.ActivityMain2Binding
import com.demoexample.observer.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            // start your next activity
            Log.d("MainActivity","MainActivity")
            startActivity(intent)
        }
    }
}



