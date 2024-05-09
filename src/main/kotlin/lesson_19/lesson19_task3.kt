package lesson_19

fun main() {

    val spaceShip = SpaceShip("Тысячалетний сокол", 15, true)
    spaceShip.shootToAsteroid()
    spaceShip.land()
    spaceShip.takeOff()

}

class SpaceShip(
    var name: String,
    var numberOfShip: Int,
    var isBattleShip: Boolean,
) {
    fun takeOff() {
        TODO("Пока не понятно как будет взлетать")
    }

    //TODO: нужна информация о дополнительной логике
    fun land() {

    }

    fun shootToAsteroid() {
        TODO("Пока не понятно как будет взлетать")
    }
}