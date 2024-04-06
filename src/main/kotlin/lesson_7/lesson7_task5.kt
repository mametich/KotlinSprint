package lesson_7

fun main() {

    val chars = 'a'..'z'
    val numbers = 0..9
    val charsToUpperCase = 'A'..'Z'
    val allSymbols = ('a'..'z') + (0..9) + ('A'..'Z')

    var password = ""

    println("Введите количество символов к паролю от 6 символов:")
    val sizeOfPassword = readln().toInt()
    if (sizeOfPassword < 6) {
        println("Пароль менее 6 символов. Введите корректный пароль")
    } else {
        password += chars.random()
        password += numbers.random()
        password += charsToUpperCase.random()

        for (i in 4 until sizeOfPassword) {
            password += chars.random()
            password += allSymbols.random()
        }
        password.toCharArray().shuffle()

        println("Ваш пароль: ${password.take(sizeOfPassword)}")

    }
}