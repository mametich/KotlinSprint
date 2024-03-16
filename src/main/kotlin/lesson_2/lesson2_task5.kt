package lesson_2

import kotlin.math.pow

private const val MONTH_IN_YEAR = 12

fun main() {

    val sumOfClientRub = 70000
    val allYears = 20
    val procent = 16.7

    val formulaProcent = (1 + (procent / 100.00) / 12)
    val newNumber = formulaProcent.pow(MONTH_IN_YEAR * allYears)
    val procentAfterYears = sumOfClientRub * newNumber
    val formatedRpocent = "%.3f".format(procentAfterYears)

    println("Размер начисленных процентов: $formatedRpocent")

}