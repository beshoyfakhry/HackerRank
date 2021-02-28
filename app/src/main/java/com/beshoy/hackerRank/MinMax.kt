package com.beshoy.hackerRank

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


/*
ive positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example, . Our minimum sum is  and our maximum sum is . We would print

16 24
Function Description

Complete the miniMaxSum function in the editor below. It should print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:

If we sum everything except 1, our sum is 2+3+4+5 .
If we sum everything except 2, our sum is 1+3+4+5.
If we sum everything except 3, our sum is 1+2+4+5.
If we sum everything except 4, our sum is 1+2+3+5.
If we sum everything except 5, our sum is 1+2+3+4.
Hints: Beware of integer overflow! Use 64-bit Integer.


Link:https://www.hackerrank.com/challenges/mini-max-sum/problem

**Trick you need to change the Int to Long to support 10^9
* */

class MinMax : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getMinAndMax(
            arrayOf(22, 3, 5, 6, 1999999999)
        )
    }


    private fun getMinAndMax(numbers: Array<Long>) {
//539674108 549382170 270968351 746219035 140597628

        //1500622257 2106243664

        var arraySum = numbers.sum()
        var maxNumber = numbers.max()!!
        var minNumber = numbers.min()!!

        var minSum = arraySum - maxNumber
        var maxSum = arraySum - minNumber

        Log.d("Data", minSum.toString() + " " + maxSum.toString())


    }
}
