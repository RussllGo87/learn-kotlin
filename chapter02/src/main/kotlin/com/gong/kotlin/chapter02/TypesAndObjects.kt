package com.gong.kotlin.chapter02

/**
 * Created by gong on 2017/6/18.
 */

//class Person(var id:String, var name:String, var age:Int) {
//    init {
//        println("A new person id:$id, name:$name, age:$age")
//    }
//}

open class Person(var id:String, var name:String, var age:Int) {
    init {
        println("A new $this, id:$id, name:$name, age:$age")
    }
}

class Student(id:String, name:String, age:Int): Person(id, name, age) {
    var score:Int = 0;
    init {
        this.score = 20
    }

    fun add() {
        score += 20
    }
}

class Teacher(id:String, name:String, age:Int): Person(id, name, age) {
    var students:MutableList<Student> = ArrayList<Student>()

    fun add(student:Student) {
        students.add(student)
    }
}

fun main(args: Array<String>) {
    val person:Person = Student("1001", "Lucy", 25)
    val anotherPerson:Person = Teacher("2001", "Mr Lee", 45)
//    person.score = 50
//    println("person.score == ${person.score}")
    println(person is Student)
    if(person is Student) {
        person.add()
        println("person.score == ${person.score}")
    }
    println(person is Teacher)
    if(anotherPerson is Teacher) {
        if(person is Student) {
            anotherPerson.add(person)
            anotherPerson.add(Student("1002", "Jim", 24))
        }
        println("Tearch:${anotherPerson.name} have ${anotherPerson.students.size} students")
        for(student in anotherPerson.students) {
            println("student id:${student.id}, name:${student.name}, score:${student.score} ")
        }
    }
}