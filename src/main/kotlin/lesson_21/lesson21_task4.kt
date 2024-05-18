package lesson_21

import java.io.File

fun main() {

    val file = File("TextFile.txt")
    println(file.writeToFile())

}

fun File.writeToFile() : String {
    val text = "Супер Пупер Текст"
    createNewFile()
    appendText(text)
    return "${text.lowercase()} записан в фаил $name"
}

