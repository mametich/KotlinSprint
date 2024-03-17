package lesson_2

import kotlin.math.pow

fun main() {

    val sumOfClientRub = 70000
    val allYears = 20
    val procent = 16.7

    val sum = sumOfClientRub * (1 + procent / 100).pow(allYears)
    val formattedSum = "%.3f".format(sum)

    println("Размер начисленных процентов: $formattedSum")

}