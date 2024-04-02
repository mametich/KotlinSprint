package lesson_9

fun main() {

    val listOfIngredientsFromUser: MutableSet<String> = mutableSetOf()

    println("Введите ингредиент:")
    for (i in 0 until 5) {
        val ingredientFromUser = readln()
        listOfIngredientsFromUser.add(ingredientFromUser)
    }
    val sortedListOfIngredients = listOfIngredientsFromUser.sorted()
    val stringSortedOfIngredients = sortedListOfIngredients.joinToString()
    val firstElementToUpperCase = stringSortedOfIngredients.replaceFirstChar {
        it.uppercaseChar()
    }

    println(firstElementToUpperCase)
}




