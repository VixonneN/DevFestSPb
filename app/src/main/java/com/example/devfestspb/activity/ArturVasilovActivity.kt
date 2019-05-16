package com.example.devfestspb.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.devfestspb.R
import com.example.devfestspb.lectures_activity.ArturVasilovProfile

class ArturVasilovActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artur_vasilov)
        buttonAllReport()
        buttonSchedule()
    }

    private fun buttonAllReport(){
        val allReportButton = findViewById<Button>(R.id.button_all_reports_ArturVasilov)
        allReportButton.setOnClickListener {
            val ESActivity = Intent(this, EvgenyShishkinActivity::class.java)
            startActivity(ESActivity)
        }
    }

    private fun buttonSchedule(){
        val scheduleButton = findViewById<Button>(R.id.schedule_of_reports_ArturVasilov)
        scheduleButton.setOnClickListener {
            val AVprofile = Intent(this, ArturVasilovProfile::class.java)
            startActivity(AVprofile)
        }
    }

}
