package lesson_15

fun main() {

    val musicalInstrument = MusicalInstrument("Гитара", 45)
    musicalInstrument.searching("Гитара")

}

interface Action {
    fun searching(name: String)
}


class MusicalInstrument(
    val name: String,
    var count: Int,
) : Action {
    override fun searching(name: String) {
        println("Выполняется поиск")
    }

}

class AccessoriesForMusicalInstrument(
    val name: String,
    var count: Int,
) {

}