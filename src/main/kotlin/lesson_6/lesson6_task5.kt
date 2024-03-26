package lesson_6

fun main() {

    println("Докажи что ты не бот. Реши пример сложения")
    var firstNumber = (1..9).random()
    var secondNumber = (1..9).random()

    var counter = 0
    var opportunity = 2

    do {
        println("Сколько будет $firstNumber + $secondNumber")
        val sumFromNumbers = firstNumber + secondNumber

        val answerFromUser = readln().toInt()
        val isCorrectAnswerForEnter = answerFromUser == sumFromNumbers

        if (isCorrectAnswerForEnter){
            counter = 0
            println("Добро пожаловать!")
        } else {
            counter++
            firstNumber = (1..9).random()
            secondNumber = (1..9).random()
        }
        println("Неправильно! Осталось ${opportunity--} попыток")

    }   while (!isCorrectAnswerForEnter && counter < 3)
        println("Доступ запрещен. Попыток нет")

}