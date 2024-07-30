// an array stores datatypes of the same type if its string its string only no float
//To print an element in an array you have to know the index position


fun main() {
    var courses = arrayOf( "MIT","Android","Datascience")
    println(courses[1])

//this is reassigning an element in an array
    courses[1] = "Web Development"
    println(courses[1])


//looping through an array
    //(for loop)

    var newcourse = courses.plus("Cybersecurity")
    for (course in newcourse){
        println(course)
    }
//size of an array
    println(courses.size)
    println(newcourse.size)

}

