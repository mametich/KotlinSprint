package lesson_7

fun main() {

    val numericArray = ('a'..'z')
    val numberArray = (0..9)

    var password = ""

    for(i in 0 until 3) {
            password += numericArray.random()
            password += numberArray.random()
        }
        println("Ваш пароль: $password")
}