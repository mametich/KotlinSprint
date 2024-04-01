package lesson_9

fun main() {

    val listOfIngredients = mutableListOf("огурец", "помидор", "салат")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")

    println("Желаете добавить еще?")
    val ingredientFromUser = readln()

    if (ingredientFromUser.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredientFromUser = readln()
        listOfIngredients.add(newIngredientFromUser)
    } else {
        println("Спасибо! Завершаем!")
    }

    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}