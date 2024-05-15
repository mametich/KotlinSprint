package lesson_19

fun main() {

    val tank = Tank()
    tank.charge(Ammo.BLUE)
    println(tank.shoot())
    tank.charge(Ammo.GREEN)
    println(tank.shoot())
    tank.charge(Ammo.RED)
    println(tank.shoot())
}

enum class Ammo(var damage: Int, var nameOfAmmo: String) {
    RED(20, "Красный"),
    BLUE(5, "Синий"),
    GREEN(10, "Зеленый");
}

class Tank {

    private var ammoForCharge: Ammo? = null

    fun charge(ammo: Ammo) {
        ammoForCharge = ammo
    }

    fun shoot(): String {
        return if (ammoForCharge != null) {
            when (ammoForCharge) {
                Ammo.BLUE -> "Танк выстрелил ${Ammo.BLUE.damage} урона"
                Ammo.GREEN -> "Танк выстрелил ${Ammo.GREEN.damage} урона"
                Ammo.RED -> "Танк выстрелил ${Ammo.RED.damage} урона"
                null -> "Необходимо зарядить патроны"
            }
        } else {
            "Необходимо зарядить патроны"
        }
    }
}