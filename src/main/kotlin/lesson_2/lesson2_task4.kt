package lesson_2

private const val BUFF_PROCENT = 20
private const val ALL_PROCENT = 100

fun main() {

    val oreOfCrystalWithoutBuff = 7
    val oreOfIronWithoutBuff = 11

    val oreOfCrystalAfterBuff = oreOfCrystalWithoutBuff * BUFF_PROCENT / ALL_PROCENT
    val oreOfIronAfterBuff = oreOfIronWithoutBuff * BUFF_PROCENT / ALL_PROCENT

    println(
        """
            Количество “бонусной” кристаллической руды после баффа: $oreOfCrystalAfterBuff
            Количество "бонусной" железной руды после баффа: $oreOfIronAfterBuff 
        """.trimIndent()
    )

}