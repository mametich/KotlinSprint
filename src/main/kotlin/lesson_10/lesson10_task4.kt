package lesson_10

fun main() {

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

    } while (goRoundOfGame(answerFromUser))
    println("Количество выигрышных партий человека: $count")
}

fun goRoundOfGame(answer: String): Boolean {
    return answer.equals("Да", ignoreCase = true)
}

fun theRollOfTheDice() = (1..6).random()

