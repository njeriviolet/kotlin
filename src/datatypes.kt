// datatypes

fun main() {
    var number :Int= 90 //Int
    var num  : Double= 78.01  // Double
    var mydecimal : Float= 67.12F // Float has to have an F
    var greeting = " Hello there " // string and it has to be in double quotes
    var consonant = 'B' // Character and it is written in single quote
    var isKotlinInteresting = true // boolean coz u have to make a choice between two things

    println(number)
    println(num)
    println(mydecimal)
    println(greeting)
    println(consonant)
    println(isKotlinInteresting)


    //typecasting -to convert one data type to another

    var x =num.toInt()
    println(x)

    var y =num.toDouble()
    println(y)



}