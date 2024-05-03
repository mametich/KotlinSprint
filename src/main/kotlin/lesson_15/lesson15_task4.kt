package lesson_15

fun main() {

    val musicalInstrument = MusicalInstrument("Гитара", 45)
    musicalInstrument.search("Гитара")

}

interface Searchable {
    fun search(name: String)
}


class MusicalInstrument(
    val name: String,
    var count: Int,
) : Searchable {
    override fun search(name: String) {
        println("Выполняется поиск")
    }
}

class AccessoriesForMusicalInstrument(
    val name: String,
    var count: Int,
)