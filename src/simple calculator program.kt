//a simple calculator program

import java .util .Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number : ") // prompt to enter first number
    var firstnumber = read.nextInt()
    if (firstnumber   == null) {
        println("Invalid input. Please enter a valid number.")
        return
    }

    println("Enter second number : ") // prompt to enter second number
    var secondnumber =read.nextDouble()
    if (secondnumber  == null) {
        println("Invalid input. Please enter a valid number.")
        return
    } // prevents the user from leaving a blank

    print("Enter an operator (+, -, *, /): ") // allows user to choose an operator
    val operator = readLine()

    val result = when (operator) {
        "+" -> firstnumber + secondnumber
        "-" -> firstnumber - secondnumber
        "*" -> firstnumber * secondnumber
        "/" -> if (secondnumber != 0.0) { // if second no is not zero
            firstnumber / secondnumber
        } 
          else
          {
            println("Error: Division by zero is not allowed.")
            return
        }

        else -> {
            println("Invalid operator. Please enter one of +, -, *, /.")
            return
        }

    }
    println("result is $result")



}