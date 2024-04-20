package lesson_12

fun main() {

    val weatherOfDay = WeatherOfDay()
    weatherOfDay.temperatureOfDay = 15
    weatherOfDay.temperatureOfNight = 20
    weatherOfDay.isRainForAllDay = true

    weatherOfDay.printInformation(weatherOfDay)

}

class WeatherOfDay {

    var temperatureOfDay: Int = 0
    var temperatureOfNight: Int = 0
    var isRainForAllDay: Boolean = false


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