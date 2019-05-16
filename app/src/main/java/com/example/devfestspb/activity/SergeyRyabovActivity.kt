package com.example.devfestspb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.devfestspb.R
import com.example.devfestspb.lectures_activity.SergeyRyabovProfile

class SergeyRyabovActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sergey_profile)
        buttonAllReport()
        buttonSchedule()
    }

    private fun buttonAllReport(){
        val allReportButton = findViewById<Button>(R.id.button_all_reports)
        allReportButton.setOnClickListener {
            val AEActivity = Intent(this, AlexanderEfremenkovActivity::class.java)
                    startActivity(AEActivity)
        }
    }

    private fun buttonSchedule(){
        val scheduleButton = findViewById<Button>(R.id.schedule_of_reports)
        scheduleButton.setOnClickListener {
            val SRPActivity = Intent(this, SergeyRyabovProfile::class.java)
            startActivity(SRPActivity)
        }
    }
}