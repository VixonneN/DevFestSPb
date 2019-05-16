package com.example.devfestspb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.devfestspb.R
import com.example.devfestspb.lectures_activity.EvgenyShishkinProfile

class EvgenyShishkinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evgeny_shishkin)
        buttonAllReport()
        buttonSchedule()
    }

    private fun buttonAllReport(){
        val allReportButton = findViewById<Button>(R.id.button_all_reports_ES)
        allReportButton.setOnClickListener {
            val rmr_Activity = Intent(this, KonstantinActivity::class.java)
            startActivity(rmr_Activity)
        }
    }

    private fun buttonSchedule(){
        val scheduleButton = findViewById<Button>(R.id.schedule_of_reports_ES)
        scheduleButton.setOnClickListener {
            val ESactivity = Intent(this, EvgenyShishkinProfile::class.java)
            startActivity(ESactivity)
        }
    }

}
