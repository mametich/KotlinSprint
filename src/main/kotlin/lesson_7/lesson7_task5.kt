package lesson_7

fun main() {

    val chars = ('a'..'z') + (0..9) + ('A'..'Z')

    var password = ""

    println("Введите количество символов к паролю от 6 символов:")
    val sizeOfPassword = readln().toInt()
    if (sizeOfPassword < 6) {
        println("Пароль менее 6 символов. Введите корректный пароль")
    } else {
        for (i in 0 until sizeOfPassword) {
            password += chars.shuffled().random()
        }
        println("Ваш пароль: ${password.take(sizeOfPassword)}")

    }
}