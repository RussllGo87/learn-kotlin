package com.gong.kotlin.chapter02

/**
 * Created by gong on 2017/6/18.
 */
val string:String = "Hello"
val fromChars:String = String(charArrayOf('H','e', 'l', 'l', 'o'))

fun main(args: Array<String>) {
    println(string == fromChars)

    println(string === fromChars)

    val arg1:Int = 2
    val arg2:Int = 3

    println("$arg1 + $arg2 = ${arg1 + arg2}")

    val salary = 1000
    println("$$salary")
    println("\$salary")

    val rawString:String = """
    \t
    \n
\\\\\$salary
    """
    println(rawString)
    println(rawString.length)
}