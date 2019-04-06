package oop

// private - same as in java
// protected - same as in Java
// internal - visible inside the same module
// public - same as in Java (default)

private val i = 42
internal fun a() = 17

private class Car(val brand: String, private val model: String) {
    private fun tellMeYourModel() = model
}

fun main() {
    println(i)
    println(a())

    val car = Car("Fiat", "Multipla")
//    println(car.tellMeYourModel()) // unable to access private functions
//    println(car.model)    // or properties
    println(car.brand)  // this is ok!
    val city = City()
}