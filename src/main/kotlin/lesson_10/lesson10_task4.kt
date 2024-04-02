package lesson_10

fun main() {

    roundOfGame()

}

fun roundOfGame() {
    var count = 0

    do {
        val moveOfComputer = theRollOfTheDice()
        val moveOfUser = theRollOfTheDice()

        println(
            """
            Игрок выбросил: $moveOfUser
            Компьютер выбросил: $moveOfComputer
        """.trimIndent()
        )

        if (moveOfUser > moveOfComputer) {
            println("Победило человечество")
            count++
        } else {
            println("Победила машина")
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val answerFromUser = readln()

    } while (answerFromUser.equals("да", ignoreCase = true))
    println("Количество выйгранных человеком раундов: ${count++}")
}

fun theRollOfTheDice() = (1..6).random()


