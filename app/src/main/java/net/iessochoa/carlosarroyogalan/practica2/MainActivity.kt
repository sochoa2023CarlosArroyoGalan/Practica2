package net.iessochoa.carlosarroyogalan.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btAgenda: Button
    private lateinit var btReceta: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAgenda=findViewById(R.id.btAgenda)
        btReceta=findViewById(R.id.btReceta)


        btAgenda.setOnClickListener {enviarAgenda()}
        btReceta.setOnClickListener {enviarResceta()}
    }
    fun enviarAgenda() {
        val intent = Intent(this, AgendaActivity::class.java)
        startActivity(intent)
    }

    fun enviarResceta() {
        val intent = Intent(this, RecetaActivity:: class.java)
        startActivity(intent)
    }
}