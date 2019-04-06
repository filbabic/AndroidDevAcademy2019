package functional

import java.io.FileReader

fun main() {

    FileReader("example.txt").use {
        val str = it.readText()
        println(str)
        it.close() // this is called automatically inside use() function, you are safe if you forget to call it
    }
}