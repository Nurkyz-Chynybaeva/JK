package com.example.jk

fun main(){
    val x1 = readLine()!!.toInt()
    val x2 = readLine()!!.toInt()

    try {
        val res = x1 / x2
    } catch (e: ArithmeticException){

    }

    println("result = $res")
}