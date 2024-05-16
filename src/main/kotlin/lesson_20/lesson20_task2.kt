package lesson_20

fun main() {

    val player = Player("Fin", 45, 100)
    println(
        "Имя игрока: ${player.name}\n" +
                "текущее здоровье: ${player.currentHealth}\n" +
                "максимальное здоровье: ${player.maxHealth}"
    )

    println()
    drinkPointHealth(player)
    println("Игрок применил леченое зелье.Здоровье игрока:${player.currentHealth}")
}

val drinkPointHealth: (Player) -> Unit = {
    it.currentHealth = it.maxHealth
}


class Player(
    var name: String,
    var currentHealth: Int,
    var maxHealth: Int,
)
