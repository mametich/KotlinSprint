package lesson_19

fun main() {

    val product = Product("Ручка", 15, Categories.OFFICE_SUPPLIES)
    product.showInfoAboutProduct()
    println()
    val product2 = Product("Брюки", 65, Categories.CLOTHES)
    product2.showInfoAboutProduct()
    println()
    val product3 = Product("Кусок темной материи", 99, Categories.OTHER)
    product3.showInfoAboutProduct()

}

enum class Categories(private var nameOfCategory: String) {
    CLOTHES("Одежда"),
    OFFICE_SUPPLIES("Канцелярские товары"),
    OTHER("Другое");

    fun getNameOfCategory(): String {
        return nameOfCategory
    }
}

class Product(
    var name: String,
    var categoryId: Int,
    private var categories: Categories,
) {
    fun showInfoAboutProduct() {
        println("Индекс:$categoryId\nНазвание:$name\nкатегория:${categories.getNameOfCategory()}")
    }
}