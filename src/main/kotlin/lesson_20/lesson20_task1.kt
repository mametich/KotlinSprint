package lesson_20

fun main() {

val greetingWords: (String) -> Unit = {
    println("С наступающим Новым Годом, $it!!!")
}
greetingWords("Fin")

}