package net.iessochoa.carlosarroyogalan.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btAgenda: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAgenda=findViewById(R.id.btAgenda)


        btAgenda.setOnClickListener {enviarAgenda()}

    }
    fun enviarAgenda() {
        val intent = Intent(this, AgendaActivity::class.java)
        startActivity(intent)
    }
}