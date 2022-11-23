package com.example.jk
fun main(){
    val a1 = readLine()!!.toInt()
    val a2 = readLine()!!.toInt()
    try {
        val res = a1 / a2
    } catch (e: ArithmeticException){

    }
    println(res)
}

