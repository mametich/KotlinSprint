package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурец", "перец", "помидор", "морковь", "капуста", "лук")

    println("Введите нужный Вам ингридиент:")
    val answerFromUser = readln()

    for (i in arrayOfIngredients){
        if (arrayOfIngredients.contains(answerFromUser)){
            println("Ингредиент $answerFromUser в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
            break
        }
    }
}