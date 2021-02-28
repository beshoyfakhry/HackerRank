package com.beshoy.hackerRank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/*
* The problem
* Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

For example, given the array  there are  elements, two positive, two negative and one zero. Their ratios would be ,  and . It should be printed as

0.400000
0.400000
0.200000
*
* Link:https://www.hackerrank.com/challenges/plus-minus/problem
*
*
* */

class PlusMinus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val data = arrayOf(2, 2, 2, 3, 4, 5, 6, -1, -2, -3, -2, -2)

        plusMinus(data)
    }

    fun plusMinus(arr: Array<Int>): Unit {

        var positiveCount = 0.0
        var negativeCount = 0.0
        var zeroCount = 0.0

        for (item in arr) {
            if (item < 0) {
                negativeCount++
            }
            if (item > 0) {
                positiveCount++
            }

            if (item == 0) {
                zeroCount++
            }

        }

        var arrayCount = arr.count().toDouble()

        var positiveDec = (positiveCount.div(arrayCount))
        var negativeDec = negativeCount / arrayCount
        var neutralDec = zeroCount / arrayCount


        print(positiveDec.toString())
        print(negativeDec.toString())
        print(neutralDec.toString())

    }
}
