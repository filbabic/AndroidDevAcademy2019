package oop

interface Driveable {
    fun drive()
}

class Bicycle : Driveable {
    override fun drive() = println("Riding bicycle")
}

class Plane() : Driveable {
    override fun drive() = println("Flying in a plane")
}

fun main() {

    val bike = Bicycle()
    bike.drive()

    val concorde = Plane()
    concorde.drive()
}