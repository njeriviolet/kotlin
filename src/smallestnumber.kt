import java.util.Scanner

//simple kotlin number to enter two numbers and returns the smallest number

fun main() {
    var read = Scanner(System.`in`) // input
    println("Enter first number : ") // opportunity to enter a first value
    var firstnumber = read.nextInt()  // var firstnumber stores the value entered

    println("Enter second number : ") // opportunity to enter a second value
    var secondnumber =read.nextInt()

    if ( firstnumber > secondnumber){
        println("$secondnumber is the smallest")
    }
    else if ( secondnumber > firstnumber) {
        println("$firstnumber is the smallest")


    }
    else {
        println("$secondnumber is equal to $firstnumber")
    }


}