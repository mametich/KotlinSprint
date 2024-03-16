package lesson_1

fun main() {

    val yearOfFlight = "1961"
    var hour = "09"
    var minute = "07"
    println(
        """
            $yearOfFlight
            $hour
            $minute
        """.trimIndent()
    )

    hour = "10"
    minute = "55"
    println("$hour:$minute")


}