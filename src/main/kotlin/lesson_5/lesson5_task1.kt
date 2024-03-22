package lesson_5

fun main() {

    println("Докажите что вы не робот, укажите ответ 2 + 2 = ?")
    val answerFromUser = readlnOrNull()?.toInt() ?: 0

    when(answerFromUser){
        4 -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}