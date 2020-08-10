package com.example.ciclodevida

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onStop = 0
    private var onDestroy = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Mi TAG", "onCreate $onCreate")
        onCreate++
    }

    override fun onStart() {
        super.onStart()
        Log.d("Mi TAG", "onStart $onStart")
        onStart++
    }

    override fun onResume() {
        super.onResume()
        Log.d("Mi TAG", "onResume $onResume")
        onResume++
    }

    override fun onPause() {
        super.onPause()
        Log.d("Mi TAG", "onPause $onPause")
        onPause++
    }

    override fun onStop() {
        Log.d("Mi TAG", "onStop $onStop")
        onStop++
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("Mi TAG", "onDestroy $onDestroy")
        onDestroy++
        super.onDestroy()
    }
}