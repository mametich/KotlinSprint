package lesson_19

fun main() {

    val tank = Tank()
    println(tank.charge(Ammo.BLUE))
    println(tank.shoot(Ammo.BLUE))
    println(tank.charge(Ammo.GREEN))
    println(tank.shoot(Ammo.GREEN))
    println(tank.charge(Ammo.RED))
    println(tank.shoot(Ammo.RED))
}

enum class Ammo(var damage: Int, var nameOfAmmo: String) {
    RED( 20, "Красный"),
    BLUE( 5, "Синий"),
    GREEN(10, "Зеленый");
}

class Tank {

    var ammoForCharge: Ammo? = null

    fun shoot(ammo: Ammo): String {
        if (ammoForCharge != null) {
            return when (ammo) {
                Ammo.BLUE -> "Танк выстрелил ${Ammo.BLUE.damage} урона"
                Ammo.GREEN -> "Танк выстрелил ${Ammo.GREEN.damage} урона"
                Ammo.RED -> "Танк выстрелил ${Ammo.RED.damage} урона"
            }
        } else {
            return "Необходимо зарядить патроны"
        }
    }

    fun charge(ammo: Ammo): String = "Танк заряжен ${ammo.nameOfAmmo}"

}



