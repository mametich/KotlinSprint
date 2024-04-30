package lesson_16

fun main() {

    val dice = Dice()
    dice.printNumberOfDice()

}

class Dice {

    private var numberOfDice: Int = (1..6).random()

    internal fun printNumberOfDice() {
        println("Выпало число: $numberOfDice")
    }
}