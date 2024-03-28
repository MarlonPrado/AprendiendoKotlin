package com.example.helloeveryone
/* Variables */

val numero:Int = 4
val numero2:Int = 2


fun main(){
    println("¡Hola Bienvenido a mi repositorio !, veamos condicionales y operaciones logicas")
    esAve()
    esMamifero()
    decision(18)
    alcanzaPlata()
}

fun esAve(){
    val ave = "Pinguino"
    if(ave == "Pinguino"){
        println("Es una Ave !")
    }
}

fun esMamifero (){
    val ballenaAzul = true
    if(ballenaAzul == true){
        println("No es un mamifero")
    }
    else{
        println("Es un mamifero")
    }
}

fun decision(numero:Int){
    if(numero > 18){
        println("Tienes edad para tomar bebida alcoholica")
    }
    else{
        println("Prohibido la venta para menores de edad")
    }
}

fun alcanzaPlata(dinero:Double=49000.99){
    if(dinero >= 50.000){
        println("Compramos el forro de Goku")
    }
    else if(dinero>30.000){
        println("Podemos comprar unos audifonos bonitos!")
    }
    else{
        println("No alcanzo la plata :(")
    }
}

