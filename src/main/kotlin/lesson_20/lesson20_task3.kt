package lesson_20

fun main() {

    val player3 = Player3("Fin")
    println(checkedHaveKey(player3))

    println("Игрок подобрал ключ")

    player3.isHaveKey = true
    println(checkedHaveKey(player3))

}

val checkedHaveKey: (Player3) -> String = {
    when (it.isHaveKey) {
        true -> "игрок дверь открыл"
        false -> "дверь заперта"
    }
}

class Player3(
    var name: String,
    var isHaveKey: Boolean = false
)