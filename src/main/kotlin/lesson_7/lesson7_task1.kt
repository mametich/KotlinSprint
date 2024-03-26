package lesson_7

fun main() {

    val chars1 = ('a'..'z').random()
    val numbers1 = (0..9).random()

    val chars2 = ('a'..'z').random()
    val numbers2 = (0..9).random()

    val  chars3 = ('a'..'z').random()
    val numbers3 = (0..9).random()

    println("Ваш пароль: $chars1$numbers1$chars2$numbers2$chars3$numbers3")
}