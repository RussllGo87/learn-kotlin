package com.gong.kotlin.chapter03

/**
 * Created by gong on 2017/6/20.
 */
const val USER_ADMIN = "admin"
const val PASSWORD_ADMIN = "admin"

const val MODE_USER = 0
const val MODE_DEBUG = 1

fun main(args: Array<String>) {
    val mode = if (args.isNotEmpty() && args[0] == "1") {
        MODE_DEBUG
    } else {
        MODE_USER
    }

    println("输入账户名:")
    val username = readLine();
    println("输入密码:")
    val password = readLine()

    if(mode == 1 && username == USER_ADMIN && password == PASSWORD_ADMIN) {
        println("管理员登录成功")
    } else {
        if(username == USER_ADMIN && password == PASSWORD_ADMIN) {
            println("当前处于USER模式,不允许管理员登录")
        } else {
            if(!username.isNullOrEmpty() && username == password) {
                println("用户登录成功")
            } else {
                println("用户登录失败")
            }
        }
    }

    val x = 5
    when(x) {
        is Int -> println("Hello $x")
        in 1..100 -> println("$x in 1..100")
    }
}