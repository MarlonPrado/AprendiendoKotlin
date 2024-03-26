package com.example.helloeveryone
/*
Variables
 */
fun main(){
    val saludo = "¡Hola Bienvenido a mi repositorio !, veamos operaciones basicas"
    val numero:Int = 4
    val numero2:Int = 2
    println(numero)
    println(numero2)

    println("La suma de " + numero + " Y " +numero2 + " es " +  (numero + numero2) )
    println("La resta de " + numero + " Y " +numero2 + " es " +  (numero - numero2) )
    println("La multiplicacion de " + numero + " Y " +numero2 + " es " +  (numero * numero2) )
    println("La division de " + numero + " Y " +numero2 + " es " +  (numero / numero2) )

    //Variable de decimal corto (Double) y decimal extendido/largo (Float)
    val numeroDecimalLargo:Float = 23f
    val numeroDecimalCorto:Double  = 23.5
    print(numeroDecimalLargo)
    println(numeroDecimalCorto)

    //Carecter y Cadena de Caracteres
    val caracter:Char = '$'
    val cadenaTexto:String = "11.000 Kg"
    println("La papaya esta a " + caracter + " " + cadenaTexto) //usando Template
    println("La papaya esta a $caracter $cadenaTexto") //usando Template

    //Concatenacion de caracteres
    //Concacteando float a Entero
    var intConcatenado = numeroDecimalLargo.toInt()
    println(intConcatenado)

    //Concactenando caracter a String

    var caracterString = caracter.toString()
    println(caracterString)

}