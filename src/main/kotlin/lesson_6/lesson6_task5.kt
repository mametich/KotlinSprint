package lesson_6

import kotlin.random.Random

fun main() {

    println("Докажи что ты не бот. Реши пример сложения")

    var counter = 0
    var opportunity = 3

    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()

        println("Сколько будет $firstNumber + $secondNumber")
        val sumFromNumbers = firstNumber + secondNumber

        val answerFromUser = readln().toInt()
        val isCorrectAnswerForEnter = answerFromUser == sumFromNumbers

        if(isCorrectAnswerForEnter) counter = 0 else counter++
        opportunity--

        when(counter){
            0 -> println("Добро пожаловать!")
            1 -> println("Неправильно! Осталось $opportunity попыток")
            2 -> println("Неправильно! Осталось $opportunity попыток")
            3 -> println("Доступ запрещен. Попыток нет")
        }
    }   while (!isCorrectAnswerForEnter && counter < 3)
}