package oop
fun getSomeHouse() = House(6, 329030.32)

fun getNormalHouse() = House(6, 200_000.0)

interface HouseFactory {
    fun createHouse(): House
}

class House(val numberOfRooms: Int, val price: Double) {

    // similar to static in Java
    companion object { // default name is "Companion"
        fun getNormalHouse() = House(6, 200_000.0)
        fun getLuxuryMansion() = House(40, 2_000_000.0)
    }

//    companion object : HouseFactory { // companion object can implement interfaces
//        override fun createHouse() = House(6, 200_000.0)
//    }
}

fun main() {
    val normalHouse = House.getNormalHouse()
    val mansion = House.getLuxuryMansion()
    val anotherNormalHouse = getNormalHouse()
    val house = getSomeHouse()
}