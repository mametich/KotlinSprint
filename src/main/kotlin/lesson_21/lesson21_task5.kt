package lesson_21

fun main() {

    val mapOfAbility: Map<String, Int> = mapOf(
        "лечение" to 10,
        "сокрушительный удар" to 25,
        "ускорение" to 35,
        "прыжок" to 99
    )


    fun Map<String, Int>.maxCategory(map: Map<String, Int>) : String {
        return "наибольшее количество очков опыта: ${map.maxByOrNull() { it.value }}"
    }

    println(mapOfAbility.maxCategory(mapOfAbility))

}



