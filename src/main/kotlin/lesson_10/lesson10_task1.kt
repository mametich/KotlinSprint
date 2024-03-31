package lesson_10

fun main() {

    val moveOfComputer = theRollOfTheDice()
    val moveOfUser = theRollOfTheDice()

    println("Игрок выбросил: $moveOfUser")
    println("Компьютер выбросил: $moveOfComputer")

    val messageOfResult = if (moveOfUser > moveOfComputer) {
        "Победило человечество"
    } else {
        "Победила машина"
    }
    println(messageOfResult)
}

fun theRollOfTheDice(): Int {
    val numberOfRoll = (1..6).random()
    return numberOfRoll
}