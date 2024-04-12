package lesson_11

fun main() {



}

class Category(
    val imageOfCategory: Int,
    val nameOfCategory: String,
    val listOfCategory: MutableList<String> =
        mutableListOf(),
)

class Recipe(
    val imageOfRecipe: Int,
    val nameOfRecipe: String,
    val textIngredients: String,
    val quantityOfPortion: Int,
)

class Ingredients(
    val nameOfIngredients: String,
    val quantityOfIngredients: Int,
    val weightOfMeasure: String,

)