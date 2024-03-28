package lesson_7

fun main() {

    val chars = 'a'..'z'
    val numbers = 0..9
    val charsToUpperCase = 'A'..'Z'

    var password = ""

    println("Введите количество символов к паролю от 6 символов:")
    val sizeOfPassword = readln().toInt()

    for (i in 0 until sizeOfPassword){
        password += chars.random()
        password += numbers.random()
        password += charsToUpperCase.random()
    }
    println("Ваш пароль: ${password.take(sizeOfPassword)}")


}