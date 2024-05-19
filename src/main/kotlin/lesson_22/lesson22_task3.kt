package lesson_22

fun main() {

    val person = Person("Гарри", 15, "мужчина")
    val (name, age, gender) = person

    println(name)
    println(age)
    println(gender)
}

data class Person(
    var name: String,
    var age: Int,
    var gender: String
)