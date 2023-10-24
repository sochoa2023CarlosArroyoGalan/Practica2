package net.iessochoa.carlosarroyogalan.practica2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class InfoReceta : AppCompatActivity() {
    companion object {
        val EXTRA_INFO = "practica2.InfoReceta.dato"
        val EXTRA_TIPO = "practica2.InfoReceta.tipo"
    }

    private lateinit var btAtras: Button
    private lateinit var tvTituloInfo: TextView
    private lateinit var tvInfoReceta: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_receta)

        btAtras = findViewById(R.id.btAtras)
        tvTituloInfo = findViewById(R.id.tvTituloInfo)
        tvInfoReceta = findViewById(R.id.tvInfoReceta)

        btAtras.setOnClickListener{finish()}

        val titulo = intent.getStringExtra(EXTRA_INFO)
        val texto = intent.getStringExtra(EXTRA_TIPO)

        tvTituloInfo.text=titulo
        tvInfoReceta.text=texto
    }
}