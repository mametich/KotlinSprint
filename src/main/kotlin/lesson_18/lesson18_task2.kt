package lesson_18

fun main() {

    val diceWithFour = DiceWithFour(4)
    val diceWithSix = DiceWithSix(6)
    val diceWithEight = DiceWithEight(8)

    val listOfDice = listOf(diceWithFour, diceWithSix, diceWithEight)
    showDiceOfRoll(listOfDice)

}

fun showDiceOfRoll(list: List<Dice>) {
    list.forEach {
        println(it.rollTheDice())
    }
}

open class Dice(private var numberOfSides: Int) {
    open fun rollTheDice() : String {
        return "Кубик из $numberOfSides сторон. Выпало: ${(1..numberOfSides).random()}"
    }
}


class DiceWithFour(numberOfSides: Int) : Dice(numberOfSides)

class DiceWithSix(numberOfSides: Int) : Dice(numberOfSides)

class DiceWithEight(numberOfSides: Int) : Dice(numberOfSides)