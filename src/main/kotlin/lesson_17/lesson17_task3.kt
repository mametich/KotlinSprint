package lesson_17

fun main() {

val folder = Folder()


    folder.name

}

class Folder {
    var name: String = "Main"
        get() = if (flagOfSecret) {
            quantityOfFiles = 0
            println("скрытая папка. Количество файлов - $quantityOfFiles").toString()
        } else {
            println("название папки: $field. Количество файлов - $quantityOfFiles")
        }.toString()


    var quantityOfFiles: Int = 15
    var flagOfSecret: Boolean = false


}

