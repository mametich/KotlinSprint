package lesson_9

import java.util.*

fun main() {

    val listOfIngredientsFromUser: MutableList<String> = mutableListOf()

    println("Введите ингредиент:")
    for (i in 0 until 5) {
        val ingredientFromUser = readln()
        if (listOfIngredientsFromUser.contains(ingredientFromUser)) {
            println("Такой ингредиент уже существует! Введите новый:")
        } else {
            listOfIngredientsFromUser.add(ingredientFromUser)
            println("Введите ингредиент:")
        }
    }

    val sortedlistOfIngredientsFromUser = listOfIngredientsFromUser.sorted()
    val listWithUpperCaseIngredients = sortedlistOfIngredientsFromUser.map {
        it.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }

    println(listWithUpperCaseIngredients)
}

