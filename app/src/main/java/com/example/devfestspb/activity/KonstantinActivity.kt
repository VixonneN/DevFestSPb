package com.example.devfestspb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.devfestspb.R
import com.example.devfestspb.lectures_activity.KonstantinProfile

class KonstantinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rmr_)
        buttonAllReport()
        buttonSchedule()
    }

    private fun buttonAllReport(){
        val allReportButton = findViewById<Button>(R.id.button_all_reports_rmr)
        allReportButton.setOnClickListener {
            Toast.makeText(this, "Последний доклад", Toast.LENGTH_SHORT).show()
        }
    }

    private fun buttonSchedule(){
        val scheduleButton = findViewById<Button>(R.id.schedule_of_reports_rmr)
        scheduleButton.setOnClickListener {
            val KTprofile = Intent(this, KonstantinProfile::class.java)
            startActivity(KTprofile)
        }
    }

}
