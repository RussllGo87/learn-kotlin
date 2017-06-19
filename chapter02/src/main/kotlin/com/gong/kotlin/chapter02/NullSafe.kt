package com.gong.kotlin.chapter02

/**
 * Created by gong on 2017/6/18.
 */
fun getName(): String?{
    return null
}

fun main(args: Array<String>) {
//    val name = getName() ?: return
//    println(name.length)

    val value:String? = "HelloWorld"
    if(value != null)
        println(value.length)
}