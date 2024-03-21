package lesson_5

fun main() {

    val firstCorrectNumber = 12
    val secondCorrectNumber = 35

    println("Введите первое число от 0 до 42:")
    val firstNumberFromUser = readlnOrNull()!!.toInt()

    println("Введите второе число от 0 до 42:")
    val secondNumberFromUser = readlnOrNull()!!.toInt()

    if (firstNumberFromUser == firstCorrectNumber && secondNumberFromUser == secondCorrectNumber) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumberFromUser == firstCorrectNumber || secondNumberFromUser == secondCorrectNumber) {
        println("Правильные цифры: $firstCorrectNumber и $secondCorrectNumber")
        println("Вы выиграли утешительный приз!")
    } else {
        println("Правильные цифры: $firstCorrectNumber и $secondCorrectNumber")
        println("Неудача")
    }
}