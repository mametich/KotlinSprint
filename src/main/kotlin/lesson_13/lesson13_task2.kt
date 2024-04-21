package lesson_13

fun main() {

    val telephoneNumber = TelephoneNumber2("Harry", 8947659853114, null)
    println("Имя: ${telephoneNumber.name}\n" +
            "Номер: ${telephoneNumber.number}\n" +
            "Компания: ${telephoneNumber.company ?: "<не указано>"}")
}

class TelephoneNumber2(
    var name: String,
    var number: Long,
    var company: String?,
)