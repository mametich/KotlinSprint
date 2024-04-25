package lesson_15


fun main() {

    val animal = Carp()
    animal.swim("Карась")

    val bird = Seagull()
    bird.fly("Чайка")

    val bird2 = Duck()
    bird2.fly("Утка")

}

interface Bird {
    fun fly(name: String)
}

interface WaterAnimals {
    fun swim(name: String)
}

class Carp() : WaterAnimals {

    override fun swim(name: String) {
        println("$name плывет")
    }

}

class Seagull() : Bird {

    override fun fly(name: String) {
        println("$name летит")
    }

}

class Duck() : Bird {

    override fun fly(name: String) {
        println("$name летит")
    }

}