package lesson_16

fun main() {

    val player = Player()
    player.showInformationAboutPlayer()

    player.takeDamage(15)
    player.showInformationAboutPlayer()
    player.takeDamage(45)
    player.showInformationAboutPlayer()

    player.heal(15)
    player.showInformationAboutPlayer()

    player.takeDamage(65)
    player.showInformationAboutPlayer()
    player.takeDamage(15)
    player.showInformationAboutPlayer()

    player.heal(15)
    player.showInformationAboutPlayer()
}

class Player {

    val name: String = ""
    private var health: Int = 100
    private var powerOfHeat: Int = 15

    fun takeDamage(damage: Int) {
        if (health >= 0) {
            health -= damage
        } else {
            deathOfPlayer()
        }
    }

    fun heal(healthFromHealer: Int) {
        if (health > 0) {
            health += healthFromHealer
        } else {
            println("Игрок погиб")
        }
    }

    private fun deathOfPlayer() {
        println("Игрок погиб")
        health = 0
        powerOfHeat = 0
    }

    fun showInformationAboutPlayer() {
        println("Количество жизни: $health Количество силы удара: $powerOfHeat")
    }
}


