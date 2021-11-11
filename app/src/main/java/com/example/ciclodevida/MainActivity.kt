package com.example.ciclodevida

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ciclodevida.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onStop = 0
    private var onDestroy = 0
    private var onRestart = 0

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("MiTAG", "onCreate $onCreate")
        onCreate++
    }

    override fun onStart() {
        super.onStart()
        Log.d("MiTAG", "onStart $onStart")
        onStart++
    }

    override fun onResume() {
        super.onResume()
        Log.d("MiTAG", "onResume $onResume")
        onResume++
    }

    override fun onPause() {
        super.onPause()
        Log.d("MiTAG", "onPause $onPause")
        onPause++
    }

    override fun onStop() {
        Log.d("MiTAG", "onStop $onStop")
        onStop++
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("MiTAG", "onDestroy $onDestroy")
        onDestroy++
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MiTAG", "onRestart $onRestart")
        onRestart++
    }
}