package lesson_7

fun main() {

    println("Введите число:")
    val numberFromUser = readln().toInt()

    for (number in 0 until numberFromUser step 2) {
        println("Четные числа: $number")
    }

}