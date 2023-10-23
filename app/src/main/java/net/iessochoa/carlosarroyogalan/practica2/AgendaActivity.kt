package net.iessochoa.carlosarroyogalan.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {
    private lateinit var tvTitulo: TextView
    private lateinit var btCancelar: Button
    private lateinit var btAceptar: Button
    private lateinit var etNombre2: EditText
    private lateinit var etApellidos: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        tvTitulo=findViewById(R.id.tvTitulo)
        btAceptar=findViewById(R.id.btAceptar)
        btCancelar=findViewById(R.id.btCancelar)
        etNombre2=findViewById(R.id.etNombre2)
        etApellidos=findViewById(R.id.etApellidos)

        btAceptar.setOnClickListener{cambioTitulo()}

        btCancelar.setOnClickListener{finish()}
    }

    fun cambioTitulo() {
        if (etNombre2.text.isEmpty()) {
            if (!etApellidos.text.isEmpty()) {
                val newText = etNombre2.text.toString() + " " + etApellidos.text.toString()
                tvTitulo.text = newText
            } else
                Toast.makeText(this, "Introduce un apellido",
                    Toast.LENGTH_LONG).show()
        }else
            Toast.makeText(this, "Introduce un nombre",
                Toast.LENGTH_LONG).show()

    }
}