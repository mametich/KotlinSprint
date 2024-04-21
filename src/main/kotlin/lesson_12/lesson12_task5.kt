package lesson_12

fun main() {

    val listOfWeather = mutableListOf<WeatherOfDay5>()

    for (i in 1..30) {
        val weatherOfDay5 = WeatherOfDay5()
        weatherOfDay5.temperatureOfDay = (0..99).random()
        weatherOfDay5.temperatureOfNight = (0..99).random()
        weatherOfDay5.isRainForAllDay = (i % 2) == 0
        listOfWeather += weatherOfDay5
    }

    val listOfTemperatureOfDay = listOfWeather.map(WeatherOfDay5::temperatureOfDay)
    val listOfTemperatureOfNight = listOfWeather.map(WeatherOfDay5::temperatureOfNight)
    val listOfDayIsRain = listOfWeather.map(WeatherOfDay5::isRainForAllDay)

    val averageTemperatureOfDay = listOfTemperatureOfDay.average()
    val averageTemperatureOfNight = listOfTemperatureOfNight.average()
    val quantityOfDayIsRain = listOfDayIsRain.filter { it == true }.size

    println("""
        средняя температура днем: $averageTemperatureOfDay 
        средняя температура ночью: $averageTemperatureOfNight
        количество дождливых дней: $quantityOfDayIsRain
    """.trimIndent())

}

    class WeatherOfDay5(
        var temperatureOfDay: Int = 0,
        var temperatureOfNight: Int = 0,
        var isRainForAllDay: Boolean = false,
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
