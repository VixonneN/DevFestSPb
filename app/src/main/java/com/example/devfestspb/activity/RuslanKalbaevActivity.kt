package com.example.devfestspb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.devfestspb.R

class RuslanKalbaevActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruslan_kalbaev)
        buttonAllReport()
        buttonSchedule()
        Toast.makeText(this, "13:35", Toast.LENGTH_SHORT).show()

    }

    private fun buttonAllReport() {
        val allReportButton = findViewById<Button>(R.id.button_all_reports_RK)
        allReportButton.setOnClickListener {
            val AVActivity = Intent(this, ArturVasilovActivity::class.java)
            startActivity(AVActivity)
        }
    }

    private fun buttonSchedule() {
        val scheduleButton = findViewById<Button>(R.id.schedule_of_reports_RK)
        scheduleButton.setOnClickListener { Toast.makeText(this, "Тут что то должно быть", Toast.LENGTH_SHORT).show() }
    }

}
