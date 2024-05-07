package lesson_19

fun main() {
    var count = 0
    val listOfPerson = mutableListOf<Person>()

    println("Введите имя человека на русском языке.\nВведите пол человека (мужчина или женщина)")

    do {
        val nameOfPerson = readlnOrNull() ?: println("Введите имя").toString()
        val genderOfPersonFromUser = readlnOrNull() ?: println("Введите имя").toString()

        val person = Person(nameOfPerson, getGenderName(genderOfPersonFromUser))

        listOfPerson.add(person)
        count++

    } while (count < 5)
        listOfPerson.forEach {
            println("${it.name} ${it.gender}")
        }
}

enum class Gender(var nameOfGender: String) {
    MAN("мужчина"),
    WOMAN("женщина");
}

fun getGenderName(genderFromUser: String) : String {
    return when(genderFromUser) {
        "мужчина" -> Gender.MAN.nameOfGender
        "женщина" -> Gender.WOMAN.nameOfGender
        else -> { "Неизвестно" }
    }
}

class Person(var name: String, var gender: String) {

}