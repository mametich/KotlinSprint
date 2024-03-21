package lesson_4

private const val IS_HAVE_DAMAGE = true
private const val MIN_QUANTITY_OF_CREW = 55
private const val MAX_QUANTITY_OF_CREW = 70
private const val IS_FAVORABLE_WEATHER = true
private const val MIN_BOXES_OF_PROVISION = 50

fun main() {

    println("наличие повреждений корпуса (да/нет)")
    val isHaveDamageOnShip = readlnOrNull() ?: ""

    println("текущий состав экипажа (указать количество)")
    val quantityOfCrewOnShip = readlnOrNull()?.toInt() ?: 0

    println("количество ящиков с провизией на борту (указать количество)")
    val boxesOfProvisionOnShip = readlnOrNull()?.toInt() ?: 0

    println("метеоусловия благоприятные(да/нет)")
    val isFavorableWeather = readlnOrNull() ?: ""

    var conditionToGoToTheSea = (isHaveDamageOnShip == "да") == IS_HAVE_DAMAGE &&
            quantityOfCrewOnShip > MIN_QUANTITY_OF_CREW &&
            quantityOfCrewOnShip < MAX_QUANTITY_OF_CREW &&
            boxesOfProvisionOnShip > MIN_BOXES_OF_PROVISION &&
            (isFavorableWeather == "да") == IS_FAVORABLE_WEATHER ||
            (isHaveDamageOnShip == "нет") == IS_HAVE_DAMAGE &&
            quantityOfCrewOnShip == MAX_QUANTITY_OF_CREW &&
            boxesOfProvisionOnShip > MIN_BOXES_OF_PROVISION


    println("Можно приступить к долгосрочному плаванию: $conditionToGoToTheSea")

}