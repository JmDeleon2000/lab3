package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ActivityInfoDumpBinding
import java.io.DataOutputStream

class infoDump : AppCompatActivity() {

    private lateinit var binds: ActivityInfoDumpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_dump)
        val modo: String = intent.getStringExtra("mode")

        val x : datos = datos()
        x.title = getString(R.string.DumpTitle)
        when (modo)
        {
            "Virus" -> {
                x.subtitle = getString(R.string.DumpSubTitle0)
                x.description = getString(R.string.Dump0)
            }
            "Indicaciones" -> {
                x.subtitle = getString(R.string.DumpSubTitle2)
                x.description = getString(R.string.Dump2)
            }
            "Sintomas" -> {
                x.subtitle = getString(R.string.DumpSubTitle1)
                x.description = getString(R.string.Dump1)
            }
            else ->
            {
                x.subtitle = "Error"
                x.description = "Error"
            }
        }

        binds.Descripcion.text = x.description
        binds.titulo.text = x.title
        binds.subtitulo.text = x.subtitle



        binds.button5.setOnClickListener(
            {
                val call: Intent = Intent(this, MainActivity::class.java)
                call.putExtra("toasty", binds.editText2.text)
                startActivity(call)
            })
    }
}
