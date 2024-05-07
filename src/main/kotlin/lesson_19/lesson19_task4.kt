package lesson_19

fun main() {

    val tank = Tank()
    println(tank.charge())
    println(tank.shoot(Ammo.BLUE))
    println(tank.charge())
    println(tank.shoot(Ammo.GREEN))
    println(tank.charge())
    println(tank.shoot(Ammo.RED))
}

enum class Ammo(var damage: Int) {
    RED( 20),
    BLUE( 5),
    GREEN(10);
}

class Tank {

    fun shoot(ammo: Ammo): String {
        return when (ammo) {
            Ammo.BLUE -> "Танк выстрелил ${Ammo.BLUE.damage} урона"
            Ammo.GREEN -> "Танк выстрелил ${Ammo.GREEN.damage} урона"
            Ammo.RED -> "Танк выстрелил ${Ammo.RED.damage} урона"
        }
    }

    fun charge(): String = "Танк заряжен"

}



