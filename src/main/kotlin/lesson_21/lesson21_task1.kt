package lesson_21

fun main() {

    val word = "Hello"
    println(word.vowelCount())

}

fun String.vowelCount() : Int {
    return count { it in "aouie" }
}