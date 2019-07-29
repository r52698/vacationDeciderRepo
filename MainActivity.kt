package com.example.org.vacationdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val vacations = arrayListOf("Cyprus", "Jordan", "Sde Dov", "Zanzibar")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedVacationButton.setOnClickListener {
            val rnd = Random()
            val selectedVacationIndex = rnd.nextInt(vacations.count())
            selectedVacationText.text = vacations[selectedVacationIndex]
        }

        addVacationButton.setOnClickListener {
            vacations.add(addVacationText.text.toString())
            addVacationText.text.clear()
            println(vacations)
        }
    }


}
