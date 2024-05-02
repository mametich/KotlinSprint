package lesson_16

import kotlin.math.pow
private const val NUMBER_OF_PI = 3.14

fun main() {

    val circle = Circle(6.2)
    println(circle.theAreaOfTheCircle())
    println(circle.circumferenceOfTheCircle())

}

class Circle(
    private var radius: Double
) {

    fun circumferenceOfTheCircle(): Double {
        return 2 * NUMBER_OF_PI * radius
    }

    fun theAreaOfTheCircle(): Double {
        return (NUMBER_OF_PI * radius).pow(2)
    }
}