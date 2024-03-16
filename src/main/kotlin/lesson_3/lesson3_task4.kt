package lesson_3

fun main() {

    var fromMotion = "E2"
    var toMotion = "E4"
    var numberOfMotion = 1

    val motion = "$fromMotion,$toMotion,$numberOfMotion"
    println(motion)

    fromMotion = "D2"
    toMotion = "D3"
    numberOfMotion = 2

    println("$fromMotion,$toMotion,$numberOfMotion")

}