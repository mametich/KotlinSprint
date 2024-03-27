package lesson_7

private const val MILLISECONDS_IN_SECONDS = 1000

fun main() {

    println("Введите число")
    val numberFromUser = readln().toInt()

    for (i in numberFromUser downTo 1) {
        Thread.sleep(MILLISECONDS_IN_SECONDS.toLong())
        println("Осталось $i секунд")
    }
    println("Время вышло")

}