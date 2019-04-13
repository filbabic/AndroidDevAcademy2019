abstract class Person(
    internal val name: String,
    val age: Int
) {
    abstract fun getMyName(): String
}

// default -> public
// private -> vidljivo samo u klasi
// protected -> vidljiv u klasi i subklasama
// internal -> vidljiv u modulu

class Student(
    name: String,
    age: Int,
    val year: Int,
    val college: College // HAS-A
) : Person(name, age), Speaker {

    override fun getMyName(): String {
        return if (age < 18) "" else name
    }

    override fun speak() {
    }
}

class College(val name: String)

class Worker(
    name: String,
    age: Int,
    private val companyName: String
) : Person(name, age), ProfessionalSpeaker {

    override fun getMyName(): String {
        return "My name is $name, I work at $companyName"
    }

    override fun speak() {
        println("Kad ce petak")
    }

    override fun speakForMoney() {

    }
}

interface Speaker { // nije zvucnik

    fun speak()
}

interface ProfessionalSpeaker : Speaker {

    fun speakForMoney()
}

fun main(args: Array<String>) {
    val filip = Student("Filip", 17, 4, College("FERIT"))
    val luka = Worker("Luka", 24, "COBE")

    filip.speak()
    luka.speak()

    val people: List<Person> = listOf(filip, luka)

    for (person in people) {
        println(person.getMyName())
    }
}