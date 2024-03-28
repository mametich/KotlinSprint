package lesson_9

fun main() {

    val listOfOneIngredient = mutableListOf(2, 50, 15)

    println("Введите количество порций:")
    val quantityOfPortion = readln().toInt()

    val listOfIngredients = listOfOneIngredient.map {
        it * quantityOfPortion
    }

    println("На $quantityOfPortion порций вам понадобится: " +
            "Яиц – ${listOfIngredients[0]}, " +
            "молока – ${listOfIngredients[1]}, " +
            "сливочного масла – ${listOfIngredients[2]}]")
}