package lesson_14

fun main() {

    val linerShip = LinerShip()
    val cargoShip = CargoShip()
    val iceBreaker = IceBreaker()

}

open class LinerShip(
    val speed: Int = 300,
    val carrying: Int = 30000,
    val capacity: Int = 10000,
)

class CargoShip(
    speed: Int = 200,
    carrying: Int = 50000,
    capacity: Int = 5000
) : LinerShip(speed, carrying, capacity)

class IceBreaker(
    speed: Int = 100,
    carrying: Int = 40000,
    capacity: Int = 2000,
    val isIceBreaker: Boolean = true
) : LinerShip(speed, carrying, capacity)