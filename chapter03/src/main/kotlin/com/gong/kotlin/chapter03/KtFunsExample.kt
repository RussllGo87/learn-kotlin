package com.gong.kotlin.chapter03

/**
 * Created by gong on 2017/6/20.
 */
fun main(args: Array<String>) {
//    println("Hello ${args[0]}")
//    checkArgs(args)

//    val arg1 = args[0].toInt()
//    val arg2 = args[1].toInt()
//    println("$arg1 + $arg2 = ${sum(arg1, arg2)}")

    println(init2Long(1000))
}

fun checkArgs(args: Array<String>) {
    if(args.size != 2) {
        System.exit(255)
    }
}

//fun sum(arg1:Int, arg2:Int):Int {
//    return arg1 + arg2
//}

fun sum(arg1:Int, arg2:Int):Int = arg1 + arg2

val init2Long = fun(x:Int):Long{
    return x.toLong()
}