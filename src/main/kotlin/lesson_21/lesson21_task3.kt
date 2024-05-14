package lesson_21

fun main() {

    fun Player3.isHealthy(): Boolean {
        return currentHealth == maxHealth
    }

    val player1 = Player3("Odyssey", 100, 100)
    println(player1.isHealthy())

    val player2 = Player3("Hercules", 56, 100)
    println(player2.isHealthy())
}

class Player3(
    var name: String,
    var currentHealth: Int,
    var maxHealth: Int,
)