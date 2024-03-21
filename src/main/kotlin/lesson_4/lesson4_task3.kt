package lesson_4

private const val IS_WEATHER_SUNNY = true
private const val IS_AWNING_IS_OPEN = true
private const val AIR_HUMIDITY_IN_PROCENT = 20
private const val SEASON = "зима"

fun main() {

    val isWeatherTodaySunny = true
    val isAwningIsOpenToday = true
    val airHumidityInProcentToday = 20
    val seasonToday = "не зима"

    val isFavorableConditions = IS_WEATHER_SUNNY == isWeatherTodaySunny &&
            IS_AWNING_IS_OPEN == isAwningIsOpenToday &&
            AIR_HUMIDITY_IN_PROCENT == airHumidityInProcentToday && SEASON == seasonToday

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")

}