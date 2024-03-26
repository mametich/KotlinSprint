package lesson_7

fun main() {

    var randomNumber1 = (0..9).random()
    var randomNumber2 = (0..9).random()
    var randomNumber3 = (0..9).random()
    var randomNumber4 = (0..9).random()

    var correctCode = "$randomNumber1$randomNumber2$randomNumber3$randomNumber4"
    println("Ваш код авторизации: $correctCode")

    println("Введите Ваш код:")
    var userCode = readln()

    do {
        val isCheckedCode = userCode == correctCode

        if (isCheckedCode) {
            println("Добро пожаловать!")
        } else {
            randomNumber1 = (0..9).random()
            randomNumber2 = (0..9).random()
            randomNumber3 = (0..9).random()
            randomNumber4 = (0..9).random()
            correctCode = "$randomNumber1$randomNumber2$randomNumber3$randomNumber4"
            println("Ваш код авторизации: $correctCode")

            println("Введите Ваш код:")
            userCode = readln()
        }
    } while (!isCheckedCode)


}