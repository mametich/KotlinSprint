package lesson_21

import java.io.File

fun main() {

    val file = File("TextFile.txt")
    println(file.writeToFile())

}

fun File.writeToFile() : String {
    val text = "Супер пупер текст"
    createNewFile()
    writeText(text)
    return "$text записан в фаил $name"
}

