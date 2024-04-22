package lesson_12

private const val TEMPERATURE_KELVIN = 273.15

fun main() {

    val weatherOfDay = WeatherOfDay(50, 10, false)
    weatherOfDay.printInformation(weatherOfDay)

}

class WeatherOfDay(
    _temperatureOfDay: Int,
    _temperatureOfNight: Int,
    _isRainForAllDay: Boolean,
) {

    var temtemperatureOfDay = _temperatureOfDay - TEMPERATURE_KELVIN
    var temperatureOfNight = _temperatureOfNight - TEMPERATURE_KELVIN
    var isRainForAllDay = _isRainForAllDay

    fun printInformation(weatherOfDay: WeatherOfDay) {
        println(
            """
            температура дня: ${weatherOfDay.temtemperatureOfDay} °С
            температура ночи: ${weatherOfDay.temperatureOfNight} °С
            наличие осадков: ${weatherOfDay.isRainForAllDay}
        """.trimIndent()
        )
    }
}