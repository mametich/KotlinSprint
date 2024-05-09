package lesson_18

fun main() {

    val point: Screen = Point("Точка")
    println(point.draw(15.6f, 17.8f))
    println(point.draw(8, 6))

    val circle: Screen = Circle("Круг")
    println(circle.draw(15.6f, 17.8f))
    println(circle.draw(6, 3))

    val square: Screen = Square("Квадрат")
    println(square.draw(15.6f, 17.8f))
    println(square.draw(2, 7))

}

open class Screen(var name: String) {

    open fun draw(coordinateXInt: Int, coordinateYInt: Int): String {
        return "Нарисована $name c координатами: $coordinateXInt и $coordinateYInt"
    }

    open fun draw(coordinateXInt: Float, coordinateYInt: Float): String {
        return "Нарисована $name c координатами: $coordinateXInt и $coordinateYInt"
    }

}

class Point(name: String) : Screen(name) {

}

class Circle(name: String) : Screen(name) {

}

class Square(name: String) : Screen(name) {

}