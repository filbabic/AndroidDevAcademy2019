package basics

fun main() {

    val price = 70

    if (price <= 15) {
        println("On sale.")
    } else {
        println("Not on sale.")
    }

    if (price <= 15) println("On sale") else println("Not on sale")     //Kotlin way



    if (price <= 15) {
        println("On sale")
    } else if (price > 15 && price <= 50) {
        println("Regular price")
    } else if (price > 50 && price <= 100) {
        println("Pricey")
    } else {
        println("Very expensive")
    }


    //Kotlin way
    when (price) {
        in 0..15 -> println("On sale")
        in 16..50 -> println("Regular price")
        in 51..100 -> println("Pricey")
        else -> println("Very expensive")
    }

    val priceDescription = when (price) {
        !in 0..15 -> "Not on sale"
        in 16..50 -> "Regular price"
        50 + 20 -> "Pricey"
        else -> "Very expensive"
    }

    println(priceDescription)
}