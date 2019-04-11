package com.example.devfestspb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.devfestspb.R

class AlexanderEfremenkovActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alexander_efremenkov)
        buttonAllReport()
        buttonSchedule()
        Toast.makeText(this, "12:25", Toast.LENGTH_SHORT).show()

    }

    private fun buttonAllReport(){
        val allReportButton = findViewById<Button>(R.id.button_all_reports_AE)
        allReportButton.setOnClickListener {
            val RKActivity = Intent(this, RuslanKalbaevActivity::class.java)
            startActivity(RKActivity)
        }
    }

    private fun buttonSchedule(){
        val scheduleButton = findViewById<Button>(R.id.schedule_of_reports_AE)
        scheduleButton.setOnClickListener { Toast.makeText(this, "Тут что то должно быть", Toast.LENGTH_SHORT).show() }
    }

}