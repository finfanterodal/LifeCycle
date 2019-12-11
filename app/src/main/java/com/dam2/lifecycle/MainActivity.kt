package com.dam2.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    // Se activa al crear una Activity, lógica de arranque, instancias...
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MiMensaje","onCreate()")
    }

    // Inicializa el código de la interfaz.
    override fun onStart() {
        super.onStart()
        Log.d("MiMensaje","onStart()")
    }

    // Se permanece aquí hasta que ocurre un evento
    override fun onResume() {
        super.onResume()
        Log.d("MiMensaje","onResume()")
    }

    // Evento interrumpido
    override fun onPause() {
        super.onPause()
        Log.d("MiMensaje","onPause()")
    }

    // No se visualiza la Activity, termina o acaba, liberación de recursos...
    override fun onStop() {
        super.onStop()
        Log.d("MiMensaje","onStop()")
    }

    // Cambio de configuración o Actividad terminada.
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MiMensaje","onDestroy()")
    }
}
