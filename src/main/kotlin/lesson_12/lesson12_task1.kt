package lesson_12

fun main() {

    val weatherOfDayMonday = WeatherOfDay()
    weatherOfDayMonday.temperatureOfDay = 10.0
    weatherOfDayMonday.temperatureOfNight = 15.0
    weatherOfDayMonday.isRainForAllDay = true

    val weatherOfDayThuesday = WeatherOfDay()
    weatherOfDayThuesday.temperatureOfDay = 14.0
    weatherOfDayThuesday.temperatureOfNight = 16.0
    weatherOfDayThuesday.isRainForAllDay = true

    weatherOfDayMonday.printInformation(weatherOfDayMonday)
    weatherOfDayThuesday.printInformation(weatherOfDayThuesday)

}

class WeatherOfDay {

    var temperatureOfDay: Double = 0.0
    var temperatureOfNight: Double = 0.0
    var isRainForAllDay: Boolean = false


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


