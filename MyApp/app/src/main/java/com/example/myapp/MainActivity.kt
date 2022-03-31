package com.example.myapp

/*fun main (){
/*
    // Tipos de variable

    val numero1:Int = 10
    var numero2:Float = 20f
    val texto1:String = "El primer numero es: "
    val texto2:String = "El segundo numero es: "
    val texto3:String = "El resultado de la suma es: "

    numero2=21.6f
    val resultado: Float
    resultado = numero1+numero2

    println("$texto1 $numero1")
    println("$texto2 $numero2")
    println("$texto3 $resultado")


    var numero:String? = null
    var otronum =readLine()
    println("$numero")
    println("$otronum")

    var first = readLine()!!.toInt()
    var second = readLine()!!.toInt()

    var Answer = first + second

    println("El resultado es $Answer")

 */

/*
    // Entrada de datos

    val articulo = readLine()!!.toString()
    val precio = readLine()!!.toFloat()
    val cantidad = readLine()!!.toInt()

    val total = cantidad*precio

    println("El precio total de $articulo es: $total")

*/
    /*
    // Condicional IF-ELSE

    println("Ingrese el primer número: ")
    val numero1 = readLine()!!.toInt()
    println("Ingrese el segundo número: ")
    val numero2 = readLine()!!.toInt()

    if (numero1>numero2){
        println("El número 1 es mayor ")
    }else {
        println("El número 2 es mayor")
    }

    val nombre1: String = "Jordan"
    val nombre2: String = "Jordan"

    if(nombre1==nombre2){
        println("Las variables son iguales")
    }else{
        println("Las variables son distintas")
    }

    println("Ingrese su edad: ")
    val edad = readLine()!!.toInt()

    if(edad > 18){
        println("Puedes ingresar")
    }else{
        println("No puedes ingresar")
    }
     */
    /*
    //Condicional con operadores logicos (+ - * / || && ! == < > <= >=)

    print("Ingrese la primera nota: ")
    val nota1 = readLine()!!.toInt()
    print("Ingrese la segunda nota: ")
    val nota2 = readLine()!!.toInt()
    print("Ingrese la tercera nota: ")
    val nota3 = readLine()!!.toInt()

    val promedio = ((nota1+nota2+nota3)/3)

    println("El promedio es: $promedio")

    if(promedio>=8){
        println("Nota exclente")
    } else{
            if(promedio>=5){
                println("Nota regular")
            }else
                println("Nota mala")
        }

    val user: String
    val PSW: String
    user = "Jordan"
    PSW = "1234"
    print("Por favor ingrese su usuario: ")
    val usuario = readLine()
    print("Por favor ingrese su contraseña: ")
    val contra = readLine()

    if (user==usuario && PSW==contra) print("Acceso permitido") else print("Acceso denegado")
     */
    /*
    // Bucle while / Do-While

    var numero: Int
    print("Ingrese un numero menor a 5: ")
    numero = readLine()!!.toInt()
    while(numero<10){
        println("El numero es: $numero")
        numero++
    }
    val PIN = "1234"
    var contador = 0
    do{
        print("Ingrese PIN: ")
        var pin = readLine()
    } while(PIN!=pin)
            println("PIN correcto")
     */
    // Bucle FOR (Aparte de estos dos ejemplos recordar que tambien podemos agregar el "step (#)" para que vaya mostrando de 2 en 2 o 5 en 5 etc...
    // Tambien que podemos saber cuales son los numeros pares o impares poniendo en el if (x%2 == 0 ) o (x%2 == 1)
    // Tambien podemos usar el "downTo" enel for, ejemplo: (x in 20 downTo 1) podemos mostras los numeros del 20 al 1.

    /*var Aprobados = 0
    var Reprobados = 0

    for (x in 1..7){
        println("Ingrese las notas de los estudiantes: ")
        val nota = readLine()!!.toInt()
        if (nota>=7){
            Aprobados++
        }else
            Reprobados++
    }
    println("Los estudiantes aprobados son: $Aprobados y los reprobados son: $Reprobados")*/
   /* var valido = false
    println("Ingrese su correo: ")
    var correo = readLine()!!.toString()
    for (x in correo){
        if(x in "@")
            valido = true
    }
    if (valido)
        println("El correo es valido")
    else
        println("El correo no es valido")*/

    // CONDICIONAL WHEN
    // A parte de la forma comun de usar el When, que se puede usar con una variable o mas separadas por ","
    // Tambien se puede usar dentro de ciclos de la siguiente forma:

    /*var red = false

    do {
        println("Ingrese el color del semaforo: ")
        var color = readLine()
        when (color){
            "verde" -> println("Velocidad aumentada")
            "Amarillo" -> println("Velocidad reducida")
            "Rojo" -> red = true
            else-> println("Color invalido")
        }
    }while (!red)
    if (red)
        println("Velocidad reducida")*/
*/
    //Crear Funciones

    /*fun main (){
        saludar("Jordan")
        despedirse("Jordan")
    }
    fun saludar(mensaje: String) {
        println("Hola $mensaje") // ("Hola " + mensaje)
    }
fun despedirse(mensaje: String){
    println("Adios $mensaje")
}    */

/*fun main (){
    println("La suma es: ${suma(1,2)}")
    println("La resta es: ${resta(1,2)}")
    println("La multiplicacion es: ${multi(1,2)}")
    println("La division es: ${divi(2,1)}")
}
fun suma (num1:Int,num2: Int):Int{
    return num1+num2
}
fun resta (num1:Int,num2: Int):Int{
    return num1-num2
}
fun multi (num1:Int,num2: Int):Int{
    return num1*num2
}
fun divi (num1: Int, num2: Int): Int {
    return num1/num2
}*/

/*fun main (){
vocales('p')
}
fun vocales (x:Char){
    when(x) {
        'a','e','i','o','u' -> println("$x , es una vocal")
        else -> println("$x, es una letra")
    }
}*/
// Funciones con una expresion

/*fun area (lado:Int) = lado*lado

fun main (){
    print("Ingrese el lado del cuadrado: ")
    val num = readLine()!!.toInt()
    println("El area del cuadrado es: ${area(num)}m2")
}*/

/*fun precio (nombre:String, valor:Double, impuesto:Double = 0.007) = valor+(valor*impuesto)

fun main (){
    print("Ingrese el nombre del articulo: ")
    val name = readLine()!!
    print("El precio de $name es: ${precio(name, 50.5)}")
}*/

//fun sueldo (nombre:String,valor:Double, horas:Int){

//}
public static fun () {
    
}

