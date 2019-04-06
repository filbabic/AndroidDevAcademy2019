package basics

fun myFirstFunction(): Unit {
    println("Hello from Kotlin function")
}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun isAdult(age: Int): Boolean {
    return age >= 18
}

fun isAdult(vararg ages: Int) {
    ages.forEach { println(it >= 18) }
}

fun coolAddition(a: Int, b: Int) = a + b

//default parameters
fun concatenateStrings(stringList: List<String>, separator: String = ", ") = stringList.joinToString(separator)


fun main() {

    val result = readLine() ?: print("Pilipe")
    myFirstFunction()

//    val result = addition(5, 10)
//    println(result)

    val coolResult = coolAddition(10, 10)
    println(coolResult)

    println(isAdult(20))
    isAdult(10, 12, 15, 18, 20, 22)

    //named parameters
    println(concatenateStrings(separator = " ", stringList = listOf("Kotlin", "java", "Swift")))
}