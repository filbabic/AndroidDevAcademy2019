package oop

// regular enum
enum class Suits {
    HEARTS, SPADES, DIAMONDS, CLUBS
}

// enum with parameters
enum class Direction(degree: Double) {
    NORTH(0.0), EAST(90.0), SOUTH(180.0), WEST(270.0)
}

fun main() {

    val suit = Suits.DIAMONDS

    // best to use with when statement - exhaustive
    val color = when (suit) {
        Suits.CLUBS, Suits.SPADES -> COLOR_BLACK
        Suits.DIAMONDS, Suits.HEARTS -> COLOR_RED
    }

    println(color)
}

const val COLOR_RED = "Red"
const val COLOR_BLACK = "Black"