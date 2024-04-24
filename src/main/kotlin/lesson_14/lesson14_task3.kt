package lesson_14

import kotlin.math.pow

private const val NUMBER_OF_P = 3.14

fun main() {

    val listOfFigure = mutableListOf<Figure>()

    val circle1 = Circle("белый", 6.5)
    val circle2 = Circle("Черный", 4.2)
    val circle3 = Circle("белый", 6.4)
    val circle4 = Circle("Черный", 5.3)

    val rectangle1 = Rectangle("Белый", 5.0, 3.1)
    val rectangle2 = Rectangle("Черный", 4.2, 6.3)
    val rectangle3 = Rectangle("Белый", 3.0, 2.9)
    val rectangle4 = Rectangle("Черный", 7.3, 1.8)

    listOfFigure.addAll(listOf(circle1, circle2, circle3, circle4, rectangle1, rectangle2, rectangle3, rectangle4))

    val listOfBlackFigure = listOfFigure.filter { it.color == "Черный" }.sumOf { it.findPerimeter() }
    val listOfWhiteFigure = listOfFigure.filter { it.color == "Белый" }.sumOf { it.findSquare() }

    println(
        """
        Cумма периметров всех черных фигур: $listOfBlackFigure
        Cумма площадей всех белых фигур: $listOfWhiteFigure
    """.trimIndent()
    )

}

abstract class Figure(val color: String) {

    abstract fun findSquare(): Double
    abstract fun findPerimeter(): Double

}

class Circle(color: String, private var radius: Double) : Figure(color) {

    override fun findSquare(): Double {
        return (NUMBER_OF_P * radius).pow(2)
    }

    override fun findPerimeter(): Double {
        return 2 * NUMBER_OF_P * radius
    }
}

class Rectangle(color: String, var width: Double, var height: Double) : Figure(color) {

    override fun findSquare(): Double {
        return width * height
    }

    override fun findPerimeter(): Double {
        return (width + height) * 2
    }

}