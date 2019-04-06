package oop

// Java way
class Country constructor(name: String, areaSqKm: Int = 0) {
    val name: String
    val areaSqKm: Int

    // This block is called when constructor is called
    init {
        this.name = name
        this.areaSqKm = areaSqKm
    }
}

// Kotlin way
class County(val name: String = "", val areaSqKm: Int = 0) {

    constructor(name: String) : this(name, 0) {
        println("Secondary constructor")
    }

    fun showCounty() = println("$name county's area in 2^km is $areaSqKm")
}

fun main() {
    val country = Country("Croatia", 56_594)
    val county = County("Osjecko-baranjska", 4_155)
    val anotherCounty = County("Pozesko-slavonska")

    county.showCounty()
    anotherCounty.showCounty()
}