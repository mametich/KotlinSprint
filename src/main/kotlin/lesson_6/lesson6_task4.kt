package lesson_6

fun main() {

    val correctNumber = (1..9).random()
    var quantityOfOpportunity = 0

    do {
        println("Введите число:")
        val numberFromUser = readln().toInt()

        val isGuessedNumber =
            numberFromUser == correctNumber
        quantityOfOpportunity++

    } while (!isGuessedNumber && quantityOfOpportunity < 5)
        println("Это была великолепная игра")
}