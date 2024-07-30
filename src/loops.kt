//looops(while,for,do-while loop)
fun main() {
    //while

    var number = 200
    while (number<=205){
        println("Number is $number")
        number ++
    }
    var x = 90
      while (x>=85){
        println(x)
        x--
    }
//Break
    var num = 1
    while (num <=5){
        println(num)
        num++
        if (num == 3) {
            break
        }
    }

 //Continue
 var count = 10
 while (count <= 15){
     if (count == 14){
         count ++
         continue
     }
     println(count)
     count++

 }

}