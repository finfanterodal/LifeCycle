package com.dam2.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MiMensaje","onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MiMensaje","onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MiMensaje","onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MiMensaje","onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MiMensaje","onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MiMensaje","onDestroy()")
    }
}
