package com.example.sumadosnumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numeroUno = findViewById<EditText>(R.id.txt_numeroUno)
        var numeroDos = findViewById<EditText>(R.id.txt_NumeroDos)
        var totl = findViewById<EditText>(R.id.txt_totl)
        var boton = findViewById<Button>(R.id.btn_Suma)

        boton.setOnClickListener {
            totl.setText(
                "La suma es: "+(numeroUno.text.toString().toFloat()+ numeroDos.text.toString().toFloat())
            )
        }
    }
}