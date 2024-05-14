package lesson_21

fun main() {

    val word = "Hello"
    println(word.vowelCount(word))

}


fun String.vowelCount(word : String) : Int {
    var count = 0
    for (letter in word) {
        if (letter == 'a'|| letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y' )
        count++
        continue
    }
    return count
}