package functional

import kotlin.system.measureTimeMillis

fun main() {

    val veryLongList = (1..999999L).toList()

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
        sum = veryLongList
            .filter { it > 50 }
            .map { it * 2 }
            .take(50000)
            .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum = veryLongList
            .asSequence()
            .filter { it > 50 }
            .map { it * 2 }
            .take(50000)
            .sum()
    }

    println("Non-lazy: $msNonLazy ms, Result: $sum")
    println("Lazy: $msLazy ms, Result: $lazySum")

//    val sequence = generateSequence(1) { it + 1 }
//
//    println(sequence.take(20).toList())
}