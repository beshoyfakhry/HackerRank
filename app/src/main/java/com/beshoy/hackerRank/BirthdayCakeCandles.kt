package com.beshoy.hackerRank

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.max


/*

You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out  candles successfully, since the tallest candles are of height  and there are  such candles.

Function Description

Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.

birthdayCakeCandles has the following parameter(s):

ar: an array of integers representing candle heights
Input Format

The first line contains a single integer, , denoting the number of candles on the cake.
The second line contains  space-separated integers, where each integer  describes the height of candle .

Constraints

Output Format

Return the number of candles that can be blown out on a new line.

Sample Input 0

4
3 2 1 3
Sample Output 0

2

Link :https://www.hackerrank.com/challenges/birthday-cake-candles/problem
* */

class BirthdayCakeCandles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        birthdayCakeCandles(
            arrayOf(22, 3, 5, 6, 1999999999)
        )
    }


    private fun birthdayCakeCandles(candelsNumber: Array<Int>):Int {

        var maxNumber = candelsNumber.max()!!
        var maxCount = 0
        for (candel in candelsNumber) {

            if (candel == maxNumber) {
                maxCount++
            }
        }
            return maxCount

    }


}
