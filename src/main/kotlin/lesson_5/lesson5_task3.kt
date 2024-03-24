package lesson_5

fun main() {

    val firstCorrectNumber = 12
    val secondCorrectNumber = 35

    println("Введите число от 0 до 42:")
    val firstNumberFromUser = readln().toInt()

    println("Введите число от 0 до 42:")
    val secondNumberFromUser = readln().toInt()

    if (
        firstNumberFromUser == firstCorrectNumber ||
        firstNumberFromUser == secondCorrectNumber &&
        secondNumberFromUser == firstCorrectNumber ||
        secondNumberFromUser == secondCorrectNumber)
    {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (
        firstNumberFromUser == firstCorrectNumber ||
        firstNumberFromUser == secondCorrectNumber ||
        secondNumberFromUser == secondCorrectNumber ||
        secondNumberFromUser == firstCorrectNumber)
    {
        println("Правильные цифры: $firstCorrectNumber и $secondCorrectNumber")
        println("Вы выиграли утешительный приз!")
    } else {
        println("Правильные цифры: $firstCorrectNumber и $secondCorrectNumber")
        println("Неудача")
    }
}