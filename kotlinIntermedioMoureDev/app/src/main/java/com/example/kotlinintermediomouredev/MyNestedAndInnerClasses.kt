package com.example.kotlinintermediomouredev

class MyNestedAndInnerClasses {

    private val one = 1

    private fun returnOne() : Int {
        return one
    }

    // Clase Anidada (Mested Class)
    class  MyNestedClass{



        fun sum(first: Int, second: Int): Int{
            return first+second
        }
    }
    // Clase Interna (Inner Class)
    inner class MyInnerClass{

        fun sumTwo(number: Int): Int {
            return  number + one + returnOne()
        }
    }
}