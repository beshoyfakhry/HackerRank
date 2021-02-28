package com.beshoy.hackerRank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


/*

Link :https://www.hackerrank.com/challenges/time-conversion/problem

* */

class TimeConversion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timeConversion(
                "07:05:45 PM"
        )
    }


    private fun timeConversion(s:String):String {

        val displayFormat = SimpleDateFormat("HH:mm:ss")

        val parseFormat = SimpleDateFormat("hh:mm:ss a")

        val date: Date = parseFormat.parse(s)

        println(parseFormat.format(date).toString() + " = " + displayFormat.format(date))

        return ""
     }


}
