package functional

fun main() {

    val input = listOf(
        mapOf("input1.csv" to listOf(3, 5, 84901, 38901, 200, 150)),
        mapOf("input1.csv" to listOf(1, 7, 123)),
        mapOf("input1.csv" to emptyList()),
        mapOf("input1.csv" to listOf(6, 754, 32, 89))
    )

    val cleaned = input.flatMap { it.values }
        .flatten()
        .filter { it in 0..100 }
        .joinToString()

    println(cleaned)
}