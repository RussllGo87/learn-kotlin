package com.gong.kotlin.chapter03

/**
 * Created by gong on 2017/6/20.
 */
class ComplexNumber(var real:Double, var imaginary:Double) {
    operator fun plus(other:ComplexNumber):ComplexNumber {
        return ComplexNumber(real + other.real, imaginary + other.imaginary)
    }

    operator fun unaryPlus():ComplexNumber {
        this.real = real + real
        this.imaginary = imaginary + imaginary
        return this
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

fun main(args: Array<String>) {
    val c1 = ComplexNumber(3.0, 4.0)
    val c2 = ComplexNumber(5.0, 6.0)

    println("$c1 + $c2 = ${c1 + c2}")
    println("${+c1}")
    println("${+c1}")


}