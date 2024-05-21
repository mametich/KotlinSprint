package lesson_22

fun main() {

    val alphaCentauri = GalacticGuide(
        "Альфа Центавра",
        "РОждение новой звезды",
        "19.05.2024",
        "18.39",
        1566666
    )
    val nameOfPlace = alphaCentauri.component1()
    val descriptionOfPlace = alphaCentauri.component2()
    val dateOfEvent = alphaCentauri.component3()
    val timeOfEvent = alphaCentauri.component4()
    val distanceOfEvent = alphaCentauri.component5()
    println(
        """
        Информация о планете:$nameOfPlace 
        Событие: $descriptionOfPlace
        Дата события: $dateOfEvent
        Время события: $timeOfEvent
        Дистанция: $distanceOfEvent
    """.trimIndent()
    )
}

data class GalacticGuide(
    var nameOfPlace: String,
    var descriptionOfPlace: String,
    var dateOfEvent: String,
    var timeOfEvent: String,
    var distanceOfEvent: Int
)