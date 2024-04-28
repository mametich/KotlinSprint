package lesson_15


fun main() {

    val animal = Carp()
    animal.swim("Карась")

    val bird = Seagull()
    bird.fly("Чайка")

    val bird2 = Duck()
    bird2.fly("Утка")
    bird2.swim("Утка")

}

interface Flying {
    fun fly(name: String)
}

interface Swimming {
    fun swim(name: String)
}

class Carp() : Swimming {

    override fun swim(name: String) {
        println("$name плывет")
    }

}

class Seagull() : Flying {

    override fun fly(name: String) {
        println("$name летит")
    }

}

class Duck() : Swimming, Flying {

    override fun fly(name: String) {
        println("$name летит")
    }

    override fun swim(name: String) {
        println("$name плавает")
    }

}