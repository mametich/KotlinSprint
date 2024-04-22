package lesson_12

private const val TEMPERATURE_KELVIN = 273.15

fun main() {

    val weatherOfDay = WeatherOfDay4(5,10,true)

}

class WeatherOfDay4(
    _temperatureOfDay: Int,
    _temperatureOfNight: Int,
    _isRainForAllDay: Boolean,
) {
    var temperatureOfDay = _temperatureOfDay - TEMPERATURE_KELVIN
    var temperatureOfNight = _temperatureOfNight - TEMPERATURE_KELVIN
    var isRainForAllDay = _isRainForAllDay


    init {
        println("""
            температура дня: $temperatureOfDay К
            температура ночи: $temperatureOfNight К
            наличие осадков: $isRainForAllDay
        """.trimIndent()
        )
    }

    fun printInformation(weatherOfDay: WeatherOfDay) {
        println(
            """
            температура дня: ${weatherOfDay.temperatureOfDay}
            температура ночи: ${weatherOfDay.temperatureOfNight}
            наличие осадков: ${weatherOfDay.isRainForAllDay}
        """.trimIndent()
        )
    }
}