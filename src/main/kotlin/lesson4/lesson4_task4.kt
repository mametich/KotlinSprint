package lesson4

fun main() {

    var dateOfDate = 5

    val isTrainingForArmsAndAbsMuscules = (dateOfDate % 2 != 0)
    val isTrainingForBackAndLegs = (dateOfDate % 2 == 0)

    println(
        """
            Упражнения для рук: $isTrainingForArmsAndAbsMuscules     
            Упражнения для ног: $isTrainingForBackAndLegs
            Упражнения для спины: $isTrainingForBackAndLegs
            Упражнения для пресса: $isTrainingForArmsAndAbsMuscules
        """.trimIndent()
    )
}