package lesson_5

fun main() {

    val firstCorrectNumber = (0..42).random()
    val secondCorrectNumber = (0..42).random()
    val thirdCorrectNumber = (0..42).random()

    val correctNumbersList: MutableList<Int> = mutableListOf()

    correctNumbersList.add(firstCorrectNumber)
    correctNumbersList.add(secondCorrectNumber)
    correctNumbersList.add(thirdCorrectNumber)

    println("Введите первое число:")
    val firstUserNumber = readln().toInt()

    println("Введите второе число:")
    val secondUserNumber = readln().toInt()

    println("Введите третье число:")
    val thirdUserNumber = readln().toInt()

    val userNumbersList: MutableList<Int> = mutableListOf()

    userNumbersList.add(firstUserNumber)
    userNumbersList.add(secondUserNumber)
    userNumbersList.add(thirdUserNumber)

    val comparisonNumbers = correctNumbersList intersect userNumbersList.toSet()
    when(comparisonNumbers.size){
       3 -> println("пользователь угадал все числа и выиграл джекпот")
       2 -> println("пользователь угадал два числа и получает крупный приз")
       1 -> println("угадано одно число, пользователю выплачивается утешительный приз")
       else -> println("пользователь не угадал ни одного числа")
    }
    println("Выиграшные числа: $correctNumbersList")

}