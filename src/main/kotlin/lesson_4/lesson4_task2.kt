package lesson_4

private const val MIN_WEIGHT = 35
private const val MAX_WEIGHT = 100
private const val MAX_VOLUME = 100

fun main() {

    val cargoWeight = 20
    val cargoVolume = 0

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight > MIN_WEIGHT && cargoWeight <= MAX_WEIGHT && cargoVolume < MAX_VOLUME}")

}