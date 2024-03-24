package lesson_6

private const val MILLISECONDS_IN_SECOND = 1000

fun main() {

    println("Введите количество секунд от 0 до 10")
    var secondsFromUser = readln().toInt()

    while (secondsFromUser > 0) {
        Thread.sleep(MILLISECONDS_IN_SECOND.toLong())
        println("Прошло ${secondsFromUser--} секунд")
    }
    println("Время вышло")
}