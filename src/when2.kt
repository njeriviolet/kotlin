import java .util.Scanner // used when u are inputting values using a keyboard

fun main() {
    var read = Scanner(System .`in`)

    println("Enter year of study : ")
    var year = read.nextInt()

    var output = when (year){
        1 -> "First year"
        2 -> "Second year"
        3 -> "Third year"
        4 -> "Fourth year"
        else -> "Invalid year"

    }
    println(" I am a $output student")











}