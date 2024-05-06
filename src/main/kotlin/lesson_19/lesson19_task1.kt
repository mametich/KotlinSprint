package lesson_19

fun main() {

for (i in Fish.entries) println(i.nameOfFish)

}

enum class Fish(var nameOfFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");
}