package com.gong.kotlin.chapter04

/**
 * Created by gong on 2017/7/27.
 */
open class Person(var name: String, open var age: Int)

class Teacher(val id: String, name: String, age: Int): Person(name, age) {
    override var age: Int = super.age
        get() = field + 10
        set(value) {
            field = value + 1
        }
}

fun main(args: Array<String>) {
    val person: Person = Person("Brown", 28)
    println("name: ${person.name} \tage: ${person.age}")
    person.age = 35
    println("${person.age}")

    val teacher: Person = Teacher("1001", "Smith", 28)
    if(teacher is Teacher) {
        print("Teacher id: ${teacher.id}")
    }
    println("\tname: ${teacher.name} \tage: ${teacher.age}")

    teacher.age = 35
    println("new age: ${teacher.age}")

}