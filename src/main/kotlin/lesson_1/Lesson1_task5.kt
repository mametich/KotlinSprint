package lesson_1

private const val SECOND_IN_SPASE = 6480
private const val SECONDS_IN_MINUTE = 60
private const val SECONDS_IN_HOUR = 3600

fun main() {


    val minutesInSpace = SECOND_IN_SPASE % SECONDS_IN_MINUTE
    val hoursInSpace = (SECOND_IN_SPASE % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE

    println("0${SECOND_IN_SPASE/3600}:$hoursInSpace:0${minutesInSpace}")

}