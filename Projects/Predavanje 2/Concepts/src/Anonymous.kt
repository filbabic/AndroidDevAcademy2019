interface AnonSpeaker {

    fun speak()
}

fun main(args: Array<String>) {
    val anon = object : AnonSpeaker {
        override fun speak() {

        }
    }
}