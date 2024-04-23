package lesson_14

fun main() {

    val linerShip = LinerShip2()
    linerShip.loadingMethod()
    linerShip.printInformationAboutShip()

    val cargoShip2 = CargoShip2()
    cargoShip2.loadingMethod()
    cargoShip2.printInformationAboutShip()

    val iceBreaker2 = IceBreaker2()
    iceBreaker2.loadingMethod()
    iceBreaker2.printInformationAboutShip()

}

open class LinerShip2(
    val name: String = "LinerShip",
    val speed: Int = 300,
    val carrying: Int = 30000,
    val capacity: Int = 10000,
) {
    open fun loadingMethod() {
        println("$name выдвигается горизонтальный трап со шкафута")
    }

    open fun printInformationAboutShip() {
        println("Скорость: $speed\n Грузоподъемность: $carrying\n Вместительность: $capacity")
    }
}

class CargoShip2(
    name: String = "CargoShip",
    speed: Int = 200,
    carrying: Int = 50000,
    capacity: Int = 5000
) : LinerShip2(name, speed, carrying, capacity) {

    override fun loadingMethod() {
        println("$name активирует погрузочный кран")
    }
}


class IceBreaker2(
    name: String = "IceBreaker",
    speed: Int = 100,
    carrying: Int = 40000,
    capacity: Int = 2000,
    val isIceBreaker: Boolean = true
) : LinerShip2(name, speed, carrying, capacity) {

    override fun loadingMethod() {
        println("$name открывает ворота со стороны кормы")
    }

    override fun printInformationAboutShip() {
        println("Скорость: $speed\n Грузоподъемность: $carrying\n Вместительность: $capacity\n Способность: $isIceBreaker")
    }
}