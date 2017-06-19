package com.gong.kotlin.chapter03

/**
 * Created by gong on 2017/6/18.
 */
val FINAL_HELLO_WORLD:String = "HelloWorld" // val means value
var helloWorld:String = "HelloWorld" // var means variable

val FINAL_HELLO_U = "Hello U"

fun main(args: Array<String>){ // (Array<String>) -> Unit
//    FINAL_HELLO_WORLD = ""
//    println(FINAL_HELLO_U)

//    println(sum(1,3))
//    println(sum.invoke(3,5))

//    for(i in args) {
//        println(i)
//    }

//    args.forEach(::println)

    args.forEach ForEach@{
        if(it == "q") return@ForEach
        println(it)
    }

    println(sum)
    println(printHello)
    println(int2Long)
//    println(::printMsg)
    println(::printMsg is () -> Unit)

    println("The End")
}

fun printMsg() {
    println("Hello")
}

val sum = { arg1:Int, arg2:Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2
}
//(Int, Int) -> Int

val printHello = {
    println("Hello")
}
// () -> Unit

val int2Long = fun(arg:Int):Long {
    return arg.toLong()
}
// (Int) -> Long