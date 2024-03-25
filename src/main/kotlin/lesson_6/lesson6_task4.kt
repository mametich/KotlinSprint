package lesson_6

fun main() {

    val correctNumber = (1..9).random()
    var quantityOfOpportunity = 4
    var counter = 0

    do {
        println("Введите число:")
        val numberFromUser = readln().toInt()

        val isGuessedNumber = numberFromUser == correctNumber

        if (isGuessedNumber) counter = 0 else counter++

        when (counter) {
            0 -> println("Вы угадали. Это была великолепная игра")
            in 1..4 -> println("Неверно. Количество попыток ${quantityOfOpportunity--}")
            else -> println("Было загадано число $correctNumber")
        }

    } while (!isGuessedNumber && counter < 5)

}