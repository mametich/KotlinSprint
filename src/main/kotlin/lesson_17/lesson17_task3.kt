package lesson_17

fun main() {

    val folder = Folder("Main", 15, false)
    println(folder.name)

    val folder2 = Folder("Second", 20, true)
    println(folder2.name)

}

class Folder(
    _name: String,
    _quantityOfFiles: Int,
    _flagOfSecret: Boolean,
) {
    var quantityOfFiles = _quantityOfFiles
    var flagOfSecret = _flagOfSecret
    var name = _name
        get() = when (flagOfSecret) {
            true -> "скрытая папка. Количество файлов - 0"
            false -> "название папки: $field. Количество файлов - $quantityOfFiles"
        }


}

