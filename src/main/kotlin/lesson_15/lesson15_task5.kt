package lesson_15

fun main() {

    val truck = Truck()
    truck.moveOfCar()
    truck.moveOfCargo(2)
    truck.moveOfPassenger(1)

    val passengerCar = PassengerCar(3)
    passengerCar.moveOfCar()
    passengerCar.moveOfPassenger(3)
    passengerCar.moveOfCar()
    passengerCar.moveOfPassenger(2)

}


interface ActionOfCar {
    fun moveOfCar()
}

interface ActionWithCargo {
    fun moveOfCargo(cargo: Int)
}

interface ActionWithPassenger {
    fun moveOfPassenger(passenger: Int)
}


class Truck(
    var quantityOfPassenger: Int = 1,
    var quantityOfCargo: Int = 2,
) : ActionOfCar, ActionWithCargo, ActionWithPassenger {

    override fun moveOfCar() {
        println("Грузовик начал движение")
    }

    override fun moveOfCargo(cargo: Int) {
        val messageOfCargo = when (cargo) {
            in 0..2 -> "Грузовик везет $cargo тонны"
            else -> "Не хватает места для груза"
        }
        println(messageOfCargo)
    }

    override fun moveOfPassenger(passenger: Int) {
        val messageOfPassenger = when (passenger) {
            1 -> "Грузовик везет $passenger пассажира"
            else -> "Не хватает места"
        }
        println(messageOfPassenger)
    }

}

class PassengerCar(
    var quantityOfPassenger: Int,
) : ActionOfCar, ActionWithPassenger {

    override fun moveOfCar() {
        println("Автомобиль начал движение")
    }

    override fun moveOfPassenger(passenger: Int) {
        val messageOfPassenger = when (passenger) {
            1 -> "Автомобиль везет $passenger пассажира"
            in 2..3 -> "Автомобиль везет $passenger пассажиров"
            else -> "Не хватает места"
        }
        println(messageOfPassenger)
    }

}