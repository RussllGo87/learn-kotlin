package com.gong.kotlin.chapter03

/**
 * Created by gong on 2017/6/20.
 */
fun main(args: Array<String>) {
    for ((index, value) in args.withIndex()) {
        println("$index -> $value")
    }

    for (indexedValue in args.withIndex()) {
        println("${indexedValue.index} -> ${indexedValue.value}")
    }
}