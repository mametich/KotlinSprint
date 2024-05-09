package lesson_20

fun main() {

    val listOfString = listOf("Кнопка1", "Кнопка2", "Кнопка3", "Кнопка4", "Кнопка5")

    val newListOfString = listOfString
        .map { println("Кнопка нажата ${listOfString}") }

    println(newListOfString)

}