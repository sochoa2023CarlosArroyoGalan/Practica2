package net.iessochoa.carlosarroyogalan.practica2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecetaActivity : AppCompatActivity() {

    private lateinit var tvDescripciontexto : TextView
    private lateinit var tvIngredientestexto : TextView
    private lateinit var tvRecetatexto : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)

        tvDescripciontexto = findViewById(R.id.tvDescripciontexto)
        tvIngredientestexto = findViewById(R.id.tvIngredientestexto)
        tvRecetatexto = findViewById(R.id.tvRecetatexto)

        tvDescripciontexto.setOnClickListener{llamaActivityDatos("Descripcion", tvDescripciontexto.text.toString())}
        tvRecetatexto.setOnClickListener{llamaActivityDatos("Receta", tvRecetatexto.text.toString())}
        tvIngredientestexto.setOnClickListener{llamaActivityDatos("Ingredientes", tvIngredientestexto.text.toString())}
    }
    fun llamaActivityDatos(s: String, toString: String) {
        val intent = Intent(this, InfoReceta::class.java)
        intent.putExtra(InfoReceta.EXTRA_INFO, s)
        intent.putExtra(InfoReceta.EXTRA_TIPO, toString)
    }
}