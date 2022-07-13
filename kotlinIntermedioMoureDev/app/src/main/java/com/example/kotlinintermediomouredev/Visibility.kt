package com.example.kotlinintermediomouredev

private class Visibility {

    var name: String? = null

    private fun sayMyName(){
        name?.let{
            println("Mi nombre es $it")
        } ?: kotlin.run {
            println("No tengo nombre")
        }
    }
}

open class VisibilityTwo {

     protected fun sayMyNameTwo(){

        val visibility = Visibility()
        visibility.name = "Jordan"
    }
}

class VisibilityThree: VisibilityTwo (){

    internal val age: Int? = null

    fun sayMyNameThree(){
        sayMyNameTwo()
    }
}