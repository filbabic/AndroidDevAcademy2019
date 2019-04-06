package basics

import java.io.IOException

fun main() {
//    val exception = getExternalInput()
    val indexException = throwIndexOutOfBoundsException()

    try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()    //try to fail gracefully, explain users what might have caused the exception
    } finally { // this block will always execute
        println("Finished handling exception")
    }
}

fun getExternalInput() {
    throw IOException("Could not read external input")
}

fun throwIndexOutOfBoundsException(): Nothing {
    throw IndexOutOfBoundsException("Index is 5, but size of the array is 4")
}