package lesson_7

fun main() {

    var randomNumber = (1000..9999).random()

    var correctCode = "$randomNumber"
    println("Ваш код авторизации: $correctCode")

    println("Введите Ваш код:")
    var userCode = readln()

    do {
        val isCheckedCode = userCode == correctCode

        if (isCheckedCode) {
            println("Добро пожаловать!")
        } else {
            randomNumber = (1000..9999).random()
            correctCode = "$randomNumber"
            println("Ваш код авторизации: $correctCode")

            println("Введите Ваш код:")
            userCode = readln()
        }
    } while (!isCheckedCode)


}