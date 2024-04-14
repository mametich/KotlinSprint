package lesson_11

fun main() {
}

class Category(
    val imageOfCategory: Int,
    val nameOfCategory: String,
    val listOfCategory: MutableList<Recipe> =
        mutableListOf(),
)

class Recipe(
    val imageOfRecipe: Int,
    val nameOfRecipe: String,
    val textIngredients: List<Ingredient>,
    val quantityOfPortion: Int,
)

class Ingredient(
    val nameOfIngredient: String,
    val quantityOfIngredient: Int,
    val weightOfMeasure: String,

)