fun main(){
    character()
   var nameAge = name("Maria",22)
    println(nameAge)

    new("Goretti")
    side()

}

//Question 1
fun character(){
    val school = "akirachix"
    println("${school[1]}${school[3]}${school[4]}")
}
//Question 2
fun name(nameH: String, age: Int): String{

    val result = "Hi, my name is $nameH and i am $age years old"
    return result
}

//Question 3

fun side() :String{
    var sn = "i  love to travel"
    println(sn.length)
    return sn


}


//Question 4
fun new(newName: String){
    if (newName =="Goretti"){
        println("That's me!")
    }
    else{
        println("I don't know who that is")
    }


}