package lesson_12

fun main() {

    val weatherOfDayMonday = WeatherOfDay(
        temperatureOfDay = 10.0,
        temperatureOfNight = 15.0,
        isRainForAllDay = true
    )

    weatherOfDayMonday.printInformation(weatherOfDayMonday)

}

class WeatherOfDay(
    var temperatureOfDay: Double,
    var temperatureOfNight: Double,
    var isRainForAllDay: Boolean,
) {

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