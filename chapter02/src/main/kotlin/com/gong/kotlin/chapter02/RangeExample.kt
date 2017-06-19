package com.gong.kotlin.chapter02

/**
 * Created by gong on 2017/6/18.
 */
val range:IntRange = 0..1024 // [0, 1024]
var rangeEsclusive:IntRange = 0 until 1024 // [0, 1024)

val emptyRange:IntRange = 0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty())
    println(range.contains(500))
    println(50 in range)

    for(i in rangeEsclusive) {
        println("$i")
    }
}
