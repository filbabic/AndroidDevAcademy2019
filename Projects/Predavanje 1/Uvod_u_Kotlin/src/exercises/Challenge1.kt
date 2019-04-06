package exercises
/*
Read input from the command-line (user name for example).

If input is empty you should store a default value.

Define different greeting messages based on whether name exists.

Use Kotlin's readLine() function. Notice its return type
 */

const val ANONYMOUS = "Anonymous"

fun main() {
    println("Please enter your name")

    val input = readLine()

    val userName = if (input != null && input.isNotBlank()) input else ANONYMOUS

    if (userName == ANONYMOUS) println("Hello guest") else println("Hello $userName!")
}

