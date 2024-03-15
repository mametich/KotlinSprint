package lesson_2

private const val MINUTES_IN_HOUR = 60

fun main() {

    val hoursOfStartTrain = 9
    val minutesOfStartTrain = 39

    val minutesOfTrip = 457

    val hoursTimeToComeTrain =
        hoursOfStartTrain + (minutesOfTrip / MINUTES_IN_HOUR)

    val minutesTimeToComeTrain =
        minutesOfStartTrain + (minutesOfTrip % MINUTES_IN_HOUR) / MINUTES_IN_HOUR

    println("$hoursTimeToComeTrain:$minutesTimeToComeTrain")
}