package com.lionobytes.firstkotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val age = 5 * 365
    val name = "ketan"
    val border = "*="
    val timesToRepeat = 23

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printBorder(border, timesToRepeat)

        println("Happy Birthday, Jone")

        // Let's print a cake!
        println("   ,,,,,   ")
        println("   |||||   ")
        println(" =========")
        println("@@@@@@@@@@@")
        println("{~@~@~@~@~}")
        println("@@@@@@@@@@@")

        // This prints an empty line
        println("")

        println("You are already ${age} days old, ${name}!")
        println("${age} is the very best age to celebrate! ")


        // banner code!
        printBorder(border, timesToRepeat)
        println("  Happy Birthday, ${name}!")
        printBorder(border, timesToRepeat)


        val age = 24;
        val layers = 5

        printCakeCandles(age)
        printCakeTop(age)
        printCakeBottom(age, layers)
    }

    // print border function
    private fun printBorder(border: String, timesToRepeat: Int) {
        repeat(timesToRepeat)
        {
            print(border)
        }
        println()
    }

    // print Cake Candles function
    fun printCakeCandles(age: Int) {
        print(" ")
        repeat(age)
        {
            print(",")
        }
        println() // Print an empty line

        print(" ") // Print the inset of the candles on the cake
        repeat(age)
        {
            print("|")
        }
        println()
    }

    // print Cake Top function
    fun printCakeTop(age: Int) {
        repeat(age + 2) {
            print("=")
        }
        println()
    }

    // print Cake Bottom function
    fun printCakeBottom(age: Int, layers: Int) {
        repeat(layers) {
            repeat(age + 2)
            {
                print("@")
            }
            println()
        }


    }
}