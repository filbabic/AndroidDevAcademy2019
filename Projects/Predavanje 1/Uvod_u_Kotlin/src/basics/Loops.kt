package basics/*
There is no standard for loop syntax in Kotlin
for(int i=0; i<20; i++){
    //some code to execute
}
 */

fun main() {

    for (element in 1..10) print(element)

    for (character in "Kotlin is amazing") print("$character ")

    val languages = listOf("Kotlin", "Swift", "Dart")

    for (language in languages) println("$language is great!")

    for (i in 10 downTo 0) print("$i ")

    for (i in 10 downTo 0 step 2) print("$i ")


// WHILE LOOP
    var x = 1

    while (x in 1..20) {
        print("$x ")
        x++
    }
}