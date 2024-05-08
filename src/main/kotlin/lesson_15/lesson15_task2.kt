package lesson_15

fun main() {

    val weatherServer = WeatherServer()

    val temperature = Temperature(27.0)
    val precipitationAmount = PrecipitationAmount(15.0)

    weatherServer.sendInformationToServer(temperature)
    weatherServer.sendInformationToServer(precipitationAmount)

}

class WeatherServer() {

    fun sendInformationToServer(weatherStationStats: WeatherStationStats) {
        val stringInformation = when (weatherStationStats) {
            is Temperature -> "Температура: ${weatherStationStats.informationAboutTemperature}"
            is PrecipitationAmount -> "Наличие осадков: ${weatherStationStats.quantityOfPrecipitation}"
            else -> "Загрузите информацию"
        }
        println(stringInformation)
    }
}


abstract class WeatherStationStats

class Temperature(val informationAboutTemperature: Double) : WeatherStationStats()

class PrecipitationAmount(val quantityOfPrecipitation: Double) : WeatherStationStats()

