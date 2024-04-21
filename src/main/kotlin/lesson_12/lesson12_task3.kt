package lesson_12

fun main() {

    val weatherOfDay = WeatherOfDay(50, 10, false)
    weatherOfDay.printInformation(weatherOfDay)

}

class WeatherOfDay(
    _temperatureOfDay: Int,
    _temperatureOfNight: Int,
    _isRainForAllDay: Boolean,
) {

    var temtemperatureOfDay = _temperatureOfDay - 273.15
    var temperatureOfNight = _temperatureOfNight - 273.15
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