package lesson_9

fun main() {

    println("Введите 5 ингредиентов через запятую:")
    val ingredientsFromUser = readln()

    val listOfIngredientsFromUser = ingredientsFromUser.split(",")
    println(listOfIngredientsFromUser)

    val newSortListOfIngredients = listOfIngredientsFromUser.sorted()
    println(newSortListOfIngredients)

}