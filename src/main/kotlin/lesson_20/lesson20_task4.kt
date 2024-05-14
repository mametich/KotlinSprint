package lesson_20

fun main() {

    val listOfString = listOf("Кнопка1", "Кнопка2", "Кнопка3", "Кнопка4", "Кнопка5")

    val newListOfString = listOfString.map { element: String -> "Кнопка нажата ${element}" }

    val filteredList = newListOfString.filterIndexed { index, _ -> index % 2 != 0 }

    filteredList.forEach {
        println(it)
    }
}