package lesson_22

fun main() {

val alphaCentauri = GalacticGuide(
    "Альфа Центавра",
    "РОждение новой звезды",
    "19.05.2024",
    "18.39",
    1566666
)
    val (name, description, date, time, distance) = alphaCentauri
    println("""
        Информация о планете: $name
        Событие: $description
        дата события: $date
        время события: $time
        дистанция: $distance
    """.trimIndent())

}

data class GalacticGuide(
    var nameOfPlace: String,
    var descriptionOfPlace: String,
    var dateOfEvent: String,
    var timeOfEvent: String,
    var distanceOfEvent: Int
)