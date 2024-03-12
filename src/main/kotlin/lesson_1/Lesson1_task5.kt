package lesson_1

fun main() {

    val secondsInSpace = 6480

    val minutesInSpace = secondsInSpace % 60
    val hoursInSpace = (secondsInSpace % 3600)/60

    println("0${secondsInSpace/3600}:$hoursInSpace:0${minutesInSpace}")

}