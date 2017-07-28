package com.gong.kotlin.chapter04

/**
 * Created by gong on 2017/7/28.
 * 功能相同方法重载可以使用默认参数实现
 */
class Overloads {
    @JvmOverloads
    fun a(int: Int = 0): Int {
        return if (int == 0) {
            0
        } else {
            int + 1
        }
    }
}

fun main(args: Array<String>) {
    val overloads = Overloads()
    println(overloads.a())
    println(overloads.a(1))
}