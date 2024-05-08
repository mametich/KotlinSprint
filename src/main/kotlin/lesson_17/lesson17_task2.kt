package lesson_17

fun main() {

val ship = Ship()
    println(ship.name)

    ship.name = "Rex"
    println(ship.name)

}

class Ship {

    var averageSpeed: Int = 15
    var portOfShip: String = "jupiter"

    var name: String = "MillenniumFalcon"
        set(value) {
            println("Вы не можете перезаписать значение")
        }

}