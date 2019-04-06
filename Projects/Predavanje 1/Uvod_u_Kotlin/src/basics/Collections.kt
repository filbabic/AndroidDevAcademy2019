package basics

fun main() {

    //ARRAY
    val objectArray: Array<Int> = arrayOf(1, 2)
    val arrayOfIntegers = arrayOf(1, 2, 3, 4, 5) //Integer[]
    val arrayOfInts = intArrayOf(6, 7, 8, 9, 10) //int[]
    for (int in arrayOfInts) print(int)
    arrayOfIntegers.forEach { println(it) }
    println(arrayOfInts.joinToString())


    // LIST
    val immutableLanguageList = listOf("Kotlin", "Java", "Swift")
    println(immutableLanguageList)
    println(immutableLanguageList[0])

    val mutableLanguageList = mutableListOf("Kotlin", "Java", "Swift")
    mutableLanguageList.add("Scala")
    mutableLanguageList.remove("Java")
    mutableLanguageList[1] = "Neki jezik"
    println(mutableLanguageList)


    //SET
    val setFibbo = setOf(1, 1, 2, 3, 5, 8, 13, 21)
    println(setFibbo)
    val mutableSetFibbo = mutableSetOf(1, 1, 2, 3, 5, 8, 13, 21)
    mutableSetFibbo.add(34)
    println(mutableSetFibbo)


    //MAP
    val immutableMap = mapOf(Pair(1, "Kotlin"), Pair(2, "Android"))
    println(immutableMap)

    val mutableMap = mutableMapOf(1 to "Kotlin", 2 to "Android")
    println(mutableMap)
    mutableMap.put(3, "swift")
    println(mutableMap)
}