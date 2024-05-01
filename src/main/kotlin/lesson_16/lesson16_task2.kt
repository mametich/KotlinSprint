package lesson_16

import kotlin.math.pow

fun main() {

    val circle = Circle(6.2)
    println(circle.theAreaOfTheCircle())
    println(circle.circumferenceOfTheCircle())

}

class Circle(
    private var radius: Double
) {

    private val numberOfPi = 3.14

    fun circumferenceOfTheCircle(): Double {
        return 2 * numberOfPi * radius
    }

    fun theAreaOfTheCircle(): Double {
        return (numberOfPi * radius).pow(2)
    }
}