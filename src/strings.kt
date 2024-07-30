fun main() {
    var firstname = "violet"
    var lastname = "Njeri"

    println(firstname)
    //Accessing a character in a string know the index position in the string
    println(firstname[1])

    //modifying a string
    println(firstname.uppercase())
    println(lastname.lowercase())

    //string concatenation-joining strings using a  plus symbol
    println( firstname + lastname)

    println( firstname + " " + lastname)

    println( firstname.plus(lastname))

    //string interpolation
    println(" My firstname is" + firstname)

    println(" My firstname is $firstname")

    var num1 = 34
    var num2 =20

    println("The sum of $num1 and  $num2 is                                                          " + (num1+num2))


}