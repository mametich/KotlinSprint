package lesson_18

fun main() {

    val fox: Animals = Fox("Лиса", "Ягоды")
    val dog: Animals = Dog("Собака", "Кости")
    val cat: Animals = Cat("Кошка", "Рыба")

    val listOfAnimals = listOf(fox, dog, cat)
    showNameOfFoodAnimals(listOfAnimals)

}

fun showNameOfFoodAnimals(list: List<Animals>) {
    list.forEach {
        println(it.eat())
    }
}

open class Animals(var name: String, private var nameOfFood: String) {

    fun eat() {
        println("$name -> $nameOfFood")
    }

    fun sleep() {
        println("$name заснула")
    }
}

class Fox(name: String, nameOfFood: String) : Animals(name, nameOfFood)

class Dog(name: String, nameOfFood: String) : Animals(name, nameOfFood)

class Cat(name: String, nameOfFood: String) : Animals(name, nameOfFood)