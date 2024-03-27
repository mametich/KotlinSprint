package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурец", "перец", "помидор", "морковь", "капуста", "лук")
    println(arrayOfIngredients.contentToString())

    println("Введите ингредиент который необходимо заменить")
    val ingredientFromUser = readln()

    if (ingredientFromUser in arrayOfIngredients) {
        println("Введите ингредиент который нужно добавить:")
    } else {
        println("Такого ингредиента нет")
    }
    val newIngredientFromUser = readln()

    val indexOfIngredient = arrayOfIngredients.indexOf(ingredientFromUser)
    arrayOfIngredients[indexOfIngredient] = newIngredientFromUser

    println(arrayOfIngredients.contentToString())

}