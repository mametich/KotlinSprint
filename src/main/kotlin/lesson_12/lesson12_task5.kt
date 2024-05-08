package lesson_12

import kotlin.random.Random

fun main() {

    val listOfWeather = mutableListOf<WeatherOfDay5>()

    for (i in 1..30) {
        val weatherOfDay5 = WeatherOfDay5()
        weatherOfDay5.temperatureOfDay = (0..99).random()
        weatherOfDay5.temperatureOfNight = (0..99).random()
        weatherOfDay5.isRainForAllDay = Random.nextBoolean()
        listOfWeather += weatherOfDay5
    }

    val listOfTemperatureOfDay = listOfWeather.map(WeatherOfDay5::temperatureOfDay)
    val listOfTemperatureOfNight = listOfWeather.map(WeatherOfDay5::temperatureOfNight)
    val listOfDayIsRain = listOfWeather.map(WeatherOfDay5::isRainForAllDay)

    val averageTemperatureOfDay = listOfTemperatureOfDay.average()
    val averageTemperatureOfNight = listOfTemperatureOfNight.average()
    val quantityOfDayIsRain = listOfDayIsRain.filter { it == true }.size

    println(
        """
        средняя температура днем: $averageTemperatureOfDay 
        средняя температура ночью: $averageTemperatureOfNight
        количество дождливых дней: $quantityOfDayIsRain
    """.trimIndent()
    )

}

class WeatherOfDay5(
    var temperatureOfDay: Int = 0,
    var temperatureOfNight: Int = 0,
    var isRainForAllDay: Boolean = false,
)


