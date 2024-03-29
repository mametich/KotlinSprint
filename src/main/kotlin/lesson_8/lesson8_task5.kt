package lesson_8

fun main() {

    var ingredients = ""

    println("Введите количество планируемых ингредиентов:")
    val quantityOfIngredients = readln().toInt()

    for (i in 0 until quantityOfIngredients) {
        println("Введите ингредиент:")
        val ingredientFromUser = readln()
        ingredients += ingredientFromUser
            .split(" ")
            .toTypedArray()
            .contentToString()
    }
    println(ingredients)


}