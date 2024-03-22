package lesson_5

private const val ADULT_AGE = 18
private const val CURRENT_YEAR = 2024

fun main() {

    println("Введите Ваш год рождения")
    val yearOfBornUser = readlnOrNull()?.toInt() ?: 0
    val ageOfUser = CURRENT_YEAR - yearOfBornUser

    if (ageOfUser > ADULT_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }
}

