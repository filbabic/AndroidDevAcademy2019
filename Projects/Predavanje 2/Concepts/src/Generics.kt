fun main(args: Array<String>) {
    // hashmap, linkedTreeMap, treeMap
    val map = mapOf(
        10 to "Sugar",
        6 to "Beer",
        11 to "Coffee"
    )

    // arrayList, linkedList

    val set = setOf(10, 1, 10, 1, 1, 1)

//    val sugar = items[7]
//    println(sugar)

//    for (number in list) {
//        println(number)
//    }

    println("separator")
    for (number in set) {
        println(number)
    }

    // list -> podatke
    // setove -> unique podatke
    // mape -> key-value

    // ne koristi toliko cesto
    // queue

    val list = listOf(10000, 1, 10, 1, 1, 1)

    val numbersAsString = list
        .map { it.toString() } // "10000", "1", "10" ..

    val splitNumbersPair =
        numbersAsString.partition {
            it.length >= 2
        }

    val (twoOrMore, lessThanTwo) = splitNumbersPair

    val names = listOf("Filip", "Luka", "Bruno")

    val namesFormatted = names
        .reduce { acc, current -> "$acc, $current" }

    val joined = names.joinToString()


    //println(splitNumbersPair)
    println(names)

    // generic functions

    val luka = Worker("Luka", 24, "COBE")

    doSomething(luka) //works with a Worker -> is a Person

    val box = Box(luka) //Box<Worker>, we can be explicit about the type as well

    // why do this when you can
    if (box.value != null) {
        val name = box.value.name // do something with the name if we need
        println(name)
    }

    box.ifPresent { println(it.name) }
}

fun <T : Person> doSomething(value: T) {
    println(value.getMyName())
}

class Box<T>(val value: T?) {

    inline fun ifPresent(action: (T) -> Unit) {
        if (value != null) {
            action(value)
        }
    }
}