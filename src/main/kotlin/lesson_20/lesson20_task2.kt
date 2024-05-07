package lesson_20

fun main() {

    val player = Player("Fin", 45, 100)
    println(
        "Имя игрока: ${player.name}\n" +
                "текущее здоровье: ${player.currentHealth}\n" +
                "максимальное здоровье: ${player.maxHealth}"
    )

    println()
    println(drinkPointHealth(player))
}

val drinkPointHealth: (Player) -> String = {
    "Игрок выпил зелье здоровья. Сейчас его уровень здоровья: " +
            "${it.currentHealth + (it.maxHealth - it.currentHealth)}"
}


class Player(
    var name: String,
    var currentHealth: Int,
    var maxHealth: Int,
)