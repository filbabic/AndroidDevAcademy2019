package functional

fun main() {

    val doubleValue = { x: Int -> x * 2 }
    val addition = { x: Int, y: Int -> x + y }

    println(doubleValue(5))

    val list = (1..100).toList()

    println(list.filter({ element -> element % 2 == 0 })) // this is Java way of passing lamdba to a function

    println(list.filter({ it <= 50 }))  // Kotlin way
    println(
        list.filter { it <= 50 }
    )
    // if lambda is last parameter to a function it can be written outside of parentheses

    println(
        list.filter(::even)  // method reference
    )
}

fun even(number: Int):Boolean = number % 2 == 0 // TODO turn this into extension function later