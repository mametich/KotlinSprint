package lesson_18

fun main() {

    val diceWithFour = DiceWithFour()
    val diceWithSix = DiceWithSix()
    val diceWithEight = DiceWithEight()

    val listOfDice = listOf(diceWithFour, diceWithSix, diceWithEight)


        listOfDice.forEach {
            println(it.rollTheDice())
        }


}

open class DiceWithFour {
    open fun rollTheDice() {
        println("Выпало: ${(1..4).random()}")
    }
}

class DiceWithSix : DiceWithFour() {
    override fun rollTheDice() {
        println("Выпало: ${(1..6).random()}")
    }
}

class DiceWithEight : DiceWithFour() {
    override fun rollTheDice() {
        println("Выпало: ${(1..8).random()}")
    }
}