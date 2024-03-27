package lesson_7

fun main() {

    val chars1 = (('a'..'z') + (0..9)).shuffled().take(6).joinToString("")
    println("Ваш пароль: $chars1")

}