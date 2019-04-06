package oop

// Generates hashCode(), equals(), toString(), copy(), destructuring
data class Address(
    val street: String, val number: Int,
    val postCode: String, val city: String
)

fun main() {
    val residence = Address("Gunduliceva", 25, "31000", "Osijek")
    val residence2 = Address("Gunduliceva", 25, "31000", "Osijek")

    println(residence)

    // Referential equality
    println(residence === residence2)

    // Structural equality
    println(residence == residence2)

    val neighbor = residence.copy(number = 26)
    println(neighbor)

    // Destructuring
    val (street, number, postCode, city) = residence
    println("$street $number $postCode $city")
}