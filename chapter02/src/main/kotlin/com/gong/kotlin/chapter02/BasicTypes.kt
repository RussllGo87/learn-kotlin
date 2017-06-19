package com.gong.kotlin.chapter02

import com.sun.org.apache.bcel.internal.generic.FLOAD

/**
 * Created by gong on 2017/6/18.
 */
val aBoolean:Boolean = true
val anotherBoolean:Boolean = false

val anInt:Int = 8
val anotherInt:Int = 0xFF
val moreInt:Int = 0b0000000000011
val maxInt:Int = Int.MAX_VALUE
val minInt:Int = Int.MIN_VALUE

val aLong:Long = 12345678913393
val maxLong:Long = Long.MAX_VALUE
val minLong:Long = Long.MIN_VALUE

val aFloat:Float = 2.0F
val anotherFloat:Float = 1E3F

val aDouble:Double = 3.0
val anotherDouble:Double = 3.1415926

val aShort:Short = 366

val aByte:Byte = 33
val maxByte:Byte = Byte.MAX_VALUE
val minByte:Byte = Byte.MIN_VALUE

fun main(args: Array<String>) {
    println(anotherInt)
    println(moreInt)

    println(maxInt)
    println(minInt)

    println(maxLong)
    println(minLong)

    println(aFloat)
    println(anotherFloat)

    println(0.0F/0.0F == Float.NaN)

    println(aDouble)
    println(anotherDouble)

    println(aShort)

    println(aByte)
    println(maxByte)
    println(minByte)
}