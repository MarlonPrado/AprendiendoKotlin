package com.example.helloeveryone

fun main(){
    //getMonth(9)
    result(2)
}

fun result(value:Any):Any{
    val result = when(value){
        is Int -> print(value + value)
        is String -> println("value")
        else -> print("Desconocido")

    }
    return result
}
fun getMonth(month:Int){
    when(month) {
        1,2,3 -> print("Primer Semestre")
        in 4..6 -> print("Final Primer semestr ..")
        in 7..12 ->{ print("Segundo semestre")
        }
        !in 1..12 -> println("Resultado no existe")
    }
}