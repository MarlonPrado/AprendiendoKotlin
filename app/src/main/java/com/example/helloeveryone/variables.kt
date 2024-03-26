package com.example.helloeveryone
/* Variables */

val numero:Int = 4
val numero2:Int = 2


fun main(){
    println("¡Hola Bienvenido a mi repositorio !, veamos funciones basicas")
    operationBasic()
    operationwithDecimal(23f, 23.5)
    operationwithString()
    operationwithContant()





}


// Funcion sin retorno con impresion en pantalla
fun operationBasic () {
    val numero:Int = 4
    val numero2:Int = 2
    println(numero)
    println(numero2)

    println("La suma de " + numero + " Y " +numero2 + " es " +  (numero + numero2) )
    println("La resta de " + numero + " Y " +numero2 + " es " +  (numero - numero2) )
    println("La multiplicacion de " + numero + " Y " +numero2 + " es " +  (numero * numero2) )
    println("La division de " + numero + " Y " +numero2 + " es " +  (numero / numero2) )
    println(numero)
    println(numero2)

    println("La suma de " + numero + " Y " +numero2 + " es " +  (numero + numero2) )
    println("La resta de " + numero + " Y " +numero2 + " es " +  (numero - numero2) )
    println("La multiplicacion de " + numero + " Y " +numero2 + " es " +  (numero * numero2) )
    println("La division de " + numero + " Y " +numero2 + " es " +  (numero / numero2) )

}

//Funcion con envio de dos parametros: float y double

fun operationwithDecimal(numeroDecimalLargo:Float,numeroDecimalCorto:Double){
    print(numeroDecimalLargo)
    println(numeroDecimalCorto)
}

//Funcion Sin parametros con retorno String
fun operationwithString():String{
    //Carecter y Cadena de Caracteres
    val resultado:String
    val caracter:Char = '$'
    val cadenaTexto:String = "11.000 Kg"
    println("La papaya esta a " + caracter + " " + cadenaTexto) //usando Template
    resultado ="La papaya esta a $caracter $cadenaTexto" //usando Template
    return resultado

}
//Funcion con argumentos definidos y retorno en String
fun operationwithContant(numeroDecimalLargo: Float =23f, numeroDecimalCorto: Double =23.5):String{
    var resultado:String
    var intConcatenado = numeroDecimalLargo.toInt()
    println(intConcatenado)
    var caracterString = intConcatenado.toString()
    resultado = caracterString
    return resultado
}
