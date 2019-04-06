package functional

//EXTENSION FUNCTIONS
fun Int.isEven(): Boolean {
    return this % 2 == 0
}


fun String.isUsernameValid() = this.length in 2..20

// EXTENSION PROPERTIES
val List<String>.lastIndex: Int
    get() = size - 1


class Test {

    companion object {
        // body
    }
}

fun Test.Companion.getTestInstance(): Test {    // It is possible to create extension functions on companion objects
    return Test()
}

fun main() {

    val validUsername = "Luka"
    val invalidUsername = "Y"
    val myAge = 24
    val languages = listOf("Kotlin", "Swift", "Java")

    println(myAge.isEven())
    println(validUsername.isUsernameValid())
    println(invalidUsername.isUsernameValid())
    println(languages.lastIndex)
}