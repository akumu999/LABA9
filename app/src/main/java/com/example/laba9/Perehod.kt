package com.example.laba9

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Perehod : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var newLayout: ConstraintLayout
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perehod)
        textView = findViewById<TextView>(R.id.textView5)
        newLayout = findViewById(R.id.layout1)
        val day = intent.getStringExtra("day")
        val month = intent.getStringExtra("month")
        val year = intent.getStringExtra("year")

        val date = LocalDateTime.of(year!!.toInt(), month!!.toInt(), day!!.toInt(), 3, 4)
        val dayweek = date.dayOfWeek.value
        when(month?.toInt()) {
            in 1..2 -> {
                textView.text = resources.getText(R.string.winter)
                newLayout.setBackgroundResource(R.color.blue)
            }
            in 3..5 -> {
                textView.text = resources.getText(R.string.spring)
                newLayout.setBackgroundResource(R.color.bluelight)
            }
            in 6..8 -> {
                textView.text = resources.getText(R.string.summer)
                newLayout.setBackgroundResource(R.color.green)
            }
            in 9..11 ->{
                textView.text = resources.getText(R.string.autumn)
                newLayout.setBackgroundResource(R.color.yellow)
            }
            12 ->{
                textView.text = resources.getText(R.string.winter)
                newLayout.setBackgroundResource(R.color.blue)
            }
        }
        val textView6 = findViewById<TextView>(R.id.textView6).apply {
            when(dayweek){
                1 -> {
                    text = resources.getText(R.string.Monday)
                }
                2 -> {
                    text = resources.getText(R.string.Tuesday)
                }
                3 -> {
                    text = resources.getText(R.string.Wednesday)
                }
                4 -> {
                    text = resources.getText(R.string.Thursday)
                }
                5 -> {
                    text = resources.getText(R.string.Friday)
                }
                6 -> {
                    text = resources.getText(R.string.Saturday)
                }
                7 -> {
                    text = resources.getText(R.string.Sunday)
                }
            }
        }
        val textView2 = findViewById<TextView>(R.id.textView2).apply {
            text= "day = $day"
        }
        val textView3 = findViewById<TextView>(R.id.textView3).apply {
            text= "month = $month"
        }
        val textView4 = findViewById<TextView>(R.id.textView4).apply {
            text= "year = $year"
        }
    }
}