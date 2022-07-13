package com.example.kotlinintermediomouredev

open class Person(name: String, age: Int): work(), Game {

    // Cualquier clase tiene una super clase comum "Any"

    open fun work(){
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

    override val game: String = "Among us"

    override fun play() {
        println("Esta persona esta jugando $game")
    }
}