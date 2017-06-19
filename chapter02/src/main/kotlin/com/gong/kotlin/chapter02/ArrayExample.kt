package com.gong.kotlin.chapter02

/**
 * Created by gong on 2017/6/18.
 */
val arrayOfInt:IntArray = intArrayOf(1,3,5,7)
val arrayOfChar:CharArray = charArrayOf('H','e', 'l', 'l', 'o')
val arrayOfString:Array<String> = arrayOf("I love", "U")
val arrayOfPerson:Array<Person> = arrayOf(Person("10001", "Lucy", 20), Student("10002", "Lily", 22), Teacher("20001", "Mr Lee", 45))

fun main(args: Array<String>) {
    println(arrayOfChar.size)

//    for(int in arrayOfInt) {
//        println(int)
//    }

    println(arrayOfInt.joinToString(""))
    println(arrayOfChar.joinToString(":"))

    for(int in arrayOfInt.slice(1..3)) {
        println(int)
    }
}