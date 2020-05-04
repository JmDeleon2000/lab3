package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.get
import com.example.lab3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binds : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val llamada : Intent = Intent(this, infoDump::class.java)

        val toasty: String = intent.getStringExtra("toasty")

        if (toasty != null)Toast.makeText(this, toasty, Toast.LENGTH_LONG).show()

        binds.button2.setOnClickListener(
            {
                llamada.putExtra("mode", "Virus")
                startActivity(llamada)
            })


        binds.button3.setOnClickListener(
            {
                llamada.putExtra("mode", "Sintomas")
                startActivity(llamada)
            })


        binds.button4.setOnClickListener(
            {
                llamada.putExtra("mode", "Indicaciones")
                startActivity(llamada)
            })


        binds.button.setOnClickListener({
            if (binds.spinner[0].isSelected)
            {
                binds.Breifing.text = getString((R.string.InfoWiros))
            }
            if (binds.spinner[1].isSelected)
            {
                binds.Breifing.text = getString((R.string.InfoAdolecentes))
            }
            if (binds.spinner[2].isSelected)
            {
                binds.Breifing.text = getString((R.string.InfoJovenes))
            }
            if (binds.spinner[3].isSelected)
            {
                binds.Breifing.text = getString((R.string.InfoMediana))
            }
            if (binds.spinner[4].isSelected)
            {
                binds.Breifing.text = getString((R.string.InfoRuckos))
            }
        })
    }
}
