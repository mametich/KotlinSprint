package lesson_18

import kotlin.math.pow

fun main() {

    val rectangle = Rectangle(10.0, 6.0, 8.0)
    println(rectangle.getSquare())

    val cube = Cube(6.0)
    println(cube.getSquare())

}

open class Box(var length: Double) {

    open fun getSquare(): Double {
        return length * 2
    }
}

class Rectangle(
    length: Double,
    private var width: Double,
    private var heigth: Double
) : Box(length) {
    override fun getSquare(): Double {
        return 2 * (length * heigth + heigth * width + length * width)
    }
}

class Cube(length: Double) : Box(length) {
    override fun getSquare(): Double {
        return (6 * length).pow(2)
    }
}