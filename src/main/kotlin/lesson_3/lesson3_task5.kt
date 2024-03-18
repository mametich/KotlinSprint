package lesson_3

fun main() {

    val motionOfPlayer = "D2-D4;0"
    val (motionFrom, motionTo, numberOfMotion,) = motionOfPlayer.split("-", ";")

    println(
        """
            Ход от: $motionFrom
            Ход куда: $motionTo
            Номер хода: $numberOfMotion 
        """.trimIndent())
}