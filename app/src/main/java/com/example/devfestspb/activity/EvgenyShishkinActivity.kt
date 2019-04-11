package com.example.devfestspb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.devfestspb.R

class EvgenyShishkinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evgeny_shishkin)
        buttonAllReport()
        buttonSchedule()
        Toast.makeText(this, "16:35", Toast.LENGTH_SHORT).show()

    }

    private fun buttonAllReport(){
        val allReportButton = findViewById<Button>(R.id.button_all_reports_ES)
        allReportButton.setOnClickListener {
            val rmr_Activity = Intent(this, RMR_Activity::class.java)
            startActivity(rmr_Activity)
        }
    }

    private fun buttonSchedule(){
        val scheduleButton = findViewById<Button>(R.id.schedule_of_reports_ES)
        scheduleButton.setOnClickListener { Toast.makeText(this, "Тут что то должно быть", Toast.LENGTH_SHORT).show() }
    }

}
