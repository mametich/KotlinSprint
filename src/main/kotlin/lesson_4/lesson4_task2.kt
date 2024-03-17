package lesson_4

fun main() {

    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val cargoWeight = 20
    val cargoVolume = 0

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight > minWeight && cargoWeight <= maxWeight && cargoVolume < maxVolume}")

}