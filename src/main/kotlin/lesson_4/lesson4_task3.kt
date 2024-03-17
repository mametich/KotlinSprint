package lesson_4

fun main() {

    val isWeatherSunny: Boolean = true
    val isAwningIsOpen: Boolean = true
    val airHumidityInProcent: Int = 20
    val season: String = "зима"

    val isWeatherTodaySunny = true
    val isAwningIsOpenToday = true
    val airHumidityInProcentToday = 20
    val seasonToday = "не зима"

    val isFavorableConditions =
        isWeatherSunny == isWeatherTodaySunny && isAwningIsOpen == isAwningIsOpenToday
                && airHumidityInProcent == airHumidityInProcentToday && season == seasonToday

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")

}