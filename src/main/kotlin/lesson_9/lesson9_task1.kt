package lesson_9

fun main() {

    val listOfIngredients = listOf("огурец", "помидор", "салат", "редис", "капуста")
    println("В рецепте есть следующие ингредиенты:")
    for (i in listOfIngredients){
        println(i)
    }
}