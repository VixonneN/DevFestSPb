package com.example.devfestspb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAllReport()
        buttonSchedule()
    }

    private fun buttonAllReport(){
        val allReportButton = findViewById<Button>(R.id.button_all_reports)
        allReportButton.setOnClickListener {Toast.makeText(this, "Тут что то должно быть", Toast.LENGTH_SHORT).show()}
    }

    private fun buttonSchedule(){
        val scheduleButton = findViewById<Button>(R.id.schedule_of_reports)
        scheduleButton.setOnClickListener { Toast.makeText(this, "Тут что то должно быть", Toast.LENGTH_SHORT).show() }
    }
}