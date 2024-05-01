package lesson_15

fun main() {

    val truck = Truck()
    truck.downloadCargo(2)
    truck.downloadPassenger(1)
    truck.move()
    truck.unloadCargo(2)
    truck.unloadPassenger(1)

    val passengerCar = PassengerCar(3)
    passengerCar.downloadPassenger(3)
    passengerCar.move()
    passengerCar.unloadPassenger(3)

    passengerCar.downloadPassenger(2)
    passengerCar.move()
    passengerCar.unloadPassenger(2)

}


interface Movable {
    fun move()
}

interface CargoCarrier {
    fun downloadCargo(cargo: Int)
    fun unloadCargo(cargo: Int)
}

interface PassengerCarrier {
    fun downloadPassenger(passenger: Int)
    fun unloadPassenger(passenger: Int)
}


class Truck(
    var quantityOfPassenger: Int = 1,
    var quantityOfCargo: Int = 2,
) : Movable, CargoCarrier, PassengerCarrier {

    override fun move() {
        println("Грузовик начал движение")
    }

    override fun downloadCargo(cargo: Int) {
        val messageOfCargo = when (cargo) {
            in 0..2 -> "Грузовик загрузил $cargo тонны"
            else -> "Не хватает места для груза"
        }
        println(messageOfCargo)
    }

    override fun unloadCargo(cargo: Int) {
        println("Грузовик разгрузил $cargo тонны")
    }

    override fun downloadPassenger(passenger: Int) {
        val messageOfPassenger = when (passenger) {
            1 -> "Грузовик посадил $passenger пассажира"
            else -> "Не хватает места"
        }
        println(messageOfPassenger)
    }

    override fun unloadPassenger(passenger: Int) {
        println("Грузовик высадил $passenger пассажира")
    }

}

class PassengerCar(
    var quantityOfPassenger: Int,
) : Movable, PassengerCarrier {

    override fun move() {
        println("Автомобиль начал движение")
    }

    override fun downloadPassenger(passenger: Int) {
        val messageOfPassenger = when (passenger) {
            1 -> "Автомобиль посадил $passenger пассажира"
            in 2..3 -> "Автомобиль посадил $passenger пассажиров"
            else -> "Не хватает места"
        }
        println(messageOfPassenger)
    }

    override fun unloadPassenger(passenger: Int) {
        val messageOfPassenger = when (passenger) {
            1 -> "Автомобиль перевез $passenger пассажира"
            in 2..3 -> "Автомобиль перевез $passenger пассажиров"
            else -> "Не хватает места"
        }
        println(messageOfPassenger)
    }
}