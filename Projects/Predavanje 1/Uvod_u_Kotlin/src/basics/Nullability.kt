package basics

fun main() {

//    val name: String = null   //non-nullable

    val lastName: String? = null    //nullable

    println(lastName?.length)

//    println(lastName!!.length)

    var city: String? = "Osijek"

    println(lastName?.length)

    city = "Zagreb"
    println(city.length)    //smart cast

    val length: Int = lastName?.length ?: 0  //elvis operator; val length will always be Int in this case

    println(length)

    if (lastName != null) {
        println(lastName.length )
    }
}