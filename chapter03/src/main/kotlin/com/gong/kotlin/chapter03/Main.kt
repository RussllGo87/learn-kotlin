package com.gong.kotlin.chapter03

/**
 * Created by gong on 2017/6/18.
 */
val FINAL_HELLO_WORLD:String = "HelloWorld" // val means value
var helloWorld:String = "HelloWorld" // var means variable

val FINAL_HELLO_U = "Hello U"

fun main(args: Array<String>){
//    FINAL_HELLO_WORLD = ""
//    println(FINAL_HELLO_U)

    println(sum(1,3))

    args.forEach { println(it) }
}

val sum = { arg1:Int, arg2:Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2 }

val printHello = {
    println("Hello")
}