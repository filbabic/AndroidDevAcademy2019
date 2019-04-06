package oop

class Empty

class City {

    var name: String = ""   // properties need to be initialized or declared abstract
        get() = field
        set(value) {
            field = value   // default implementation of getter and setter
        }
    var population: Int = 0 // custom setter
        set(value) {
            if (value > 0) field = value
        }
}

fun main() {

    val emptyInstance = Empty()

    val city = City()
    city.name = "Osijek"    // this implicitly calls property setter
    city.population = 100_000
    city.population = 0
    println(city.name)
    println(city.population)
}