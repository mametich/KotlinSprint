package lesson_22

fun main() {

    val regularBook = RegularBook2("Неукротимая планета", "Гарри Гаррисон")
    val dataBook = DataBook2("Щит и меч", "Вадим Кожевников")

    //в обычном классе метод toString() не переопределен и он возвращает хэш-код объекта в шестнадцатеричном виде
    println(regularBook)

    //в дата классе метод toString() переопределен и он возвращает строку
    println(dataBook)

}

class RegularBook2(
    var name: String,
    var author: String,
)

data class DataBook2(
    var name: String,
    var author: String,
)