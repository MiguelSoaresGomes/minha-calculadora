package com.Miguel.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//AppCompatActivity()* herda ou importa as funções  de tela do kotlin
class PrincipalActivity: AppCompatActivity() {

    var nome_aplicativo ="Minha Calculadora"
    val nome_aplicativo_string: String = "Minha Calculadora"
    val valor_intero: Int = 1250
    val valor_com_ponto: Float = 1250.00f
    val aprovado: Boolean = false //true or false
    val sigla_do_app: Char = 'M'// so permite aspas simples '', e so uma letra

    //const -->  faz com que a variavel não seja alterado

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...

        //seta conteudo da view como o arquivo principal
        setContentView(R.layout.activity_main)
           

        var edtNumero: EditText = findViewById(R.id.edtNumero)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        btnCalcular.setOnClickListener {

            val text = edtNumero.text
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()
        }
    }

    fun eventoClikBotaoCaucular(){

    }

}
