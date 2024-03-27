package lesson_6

fun main() {

    println("Докажи что ты не бот. Реши пример сложения")
    val firstNumber = (1..9)
    val secondNumber = (1..9)

    var counter = 0
    var opportunity = 2

    do {
        val randomFirstNumber = firstNumber.random()
        val randomSecondNumber = secondNumber.random()

        println("Сколько будет $randomFirstNumber + $randomSecondNumber")

        val sumFromNumbers = randomFirstNumber + randomSecondNumber
        val answerFromUser = readln().toInt()
        counter++

        val isCorrectAnswer = sumFromNumbers == answerFromUser
        if (isCorrectAnswer) {
            println ("Добро пожаловать!")
            return
        }
        println("Неправильно! Осталось ${opportunity--} попыток")
    }   while (counter < 3)


    println("Доступ запрещен. Попыток нет")
}