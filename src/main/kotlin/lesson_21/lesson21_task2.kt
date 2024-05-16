package lesson_21


fun main() {

    val listOfNumber = listOf(5, 8, 25, 36, 78)

    fun List<Int>.evenNumbersSum(list: List<Int>): Int {
        return list.filter { it % 2 == 0 }.sum()
    }

    println(listOfNumber.evenNumbersSum(listOfNumber))
}