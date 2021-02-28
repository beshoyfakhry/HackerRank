package com.beshoy.hackerRank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/*
Consider a staircase of size :

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Function Description

Complete the staircase function in the editor below. It should print a staircase as described above.

staircase has the following parameter(s):

n: an integer


Link:https://www.hackerrank.com/challenges/staircase/problem
* */

class Staircase : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startDraw(6)
    }

    private fun startDraw(totalStarsCount: Int): Unit {

        var spaces = 0

        for (starsStep in 1..totalStarsCount + 1) {

            if (starsStep != totalStarsCount + 1) {

                spaces = totalStarsCount - starsStep

                print(" ".repeat(spaces) + "#".repeat(starsStep))
                print("\n")
            } else return
        }
    }
}
