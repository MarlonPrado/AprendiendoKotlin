fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = firstNumber + secondNumber 
    println("$firstNumber + $secondNumber = $result")
    sum(firstNumber,secondNumber,thirdNumber)
    subtract(firstNumber,secondNumber,thirdNumber)
}

fun sum (number:Int, number2:Int,number3:Int){
    println("$number + $number2 = ${number+number2}")
    println("$number + $number3 = ${number+number3}")
}

fun subtract (number:Int, number2:Int,number3:Int){
    println("$number - $number2 = ${number-number2}")
    println("$number - $number3 = ${number-number3}")
}