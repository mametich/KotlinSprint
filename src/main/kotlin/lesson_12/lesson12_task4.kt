package lesson_12

fun main() {

    val weatherOfDay = WeatherOfDay4(5,10,true)

}

class WeatherOfDay4(
    var temperatureOfDay: Int,
    var temperatureOfNight: Int,
    var isRainForAllDay: Boolean,
) {

    init {
        println("""
            температура дня: ${temperatureOfDay - 273.15} К
            температура ночи: ${temperatureOfNight - 273.15} К
            наличие осадков: $isRainForAllDay
        """.trimIndent()
        )
    }

    fun printInformation(weatherOfDay: WeatherOfDay) {
        println(
            """
            температура дня: ${weatherOfDay.temperatureOfDay - 273.15}
            температура ночи: ${weatherOfDay.temperatureOfNight - 273.15}
            наличие осадков: ${weatherOfDay.isRainForAllDay}
        """.trimIndent()
        )
    }
}