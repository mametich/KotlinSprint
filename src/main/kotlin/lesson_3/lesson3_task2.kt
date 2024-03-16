package lesson_3

fun main() {

    val name = "Татьяна"
    val lastName = "Андреева"
    val middleName = "Сергеевна"
    val age = 20

    val newLastName = "Сидорова"
    val newAge = 22

    println(
        """
            $lastName $name $middleName, $age лет
            $newLastName $name $middleName, $newAge года
        """.trimIndent()
    )

}