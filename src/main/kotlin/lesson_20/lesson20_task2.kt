package lesson_20

fun main() {

    val player = Player("Fin", 45, 100)
    println(
        "Имя игрока: ${player.name}\n" +
                "текущее здоровье: ${player.currentHealth}\n" +
                "максимальное здоровье: ${player.maxHealth}"
    )

    println()
    println("Использовано лечебное зелье. Здоровье игрока:${drinkPointHealth(player)}")
}

val drinkPointHealth: (Player) -> Int = {
            it.currentHealth + (it.maxHealth - it.currentHealth)
}



class Player(
    var name: String,
    var currentHealth: Int,
    var maxHealth: Int,
)