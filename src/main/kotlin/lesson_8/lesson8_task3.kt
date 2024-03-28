package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурец", "перец", "помидор", "морковь", "капуста", "лук")

    println("Введите нужный Вам ингридиент:")
    val answerFromUser = readln()

    val isHaveIngredient = answerFromUser in arrayOfIngredients
    when (isHaveIngredient) {
        true -> println("Ингредиент $answerFromUser есть в рецепте")
        false -> println("Такого ингредиента нет")
    }
}
