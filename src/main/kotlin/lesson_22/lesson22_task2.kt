package lesson_22

fun main() {

    val regularBook2 = RegularBook2("Гарри Поттер", "Джоан Роулинг")
    val dataBook2 = DataBook2("Властелин колец", "Джон Рональд Руэл Толкин")

    //в обычном классе не переопредлен метод toString() поэтому печатается хэш код в 16-разрядном виде
    println(regularBook2)

    // дата классе метод toString() переопределен и печатает строку
    println(dataBook2)


}

class RegularBook2(
    var name: String,
    var author: String,
)

data class DataBook2(
    var name: String,
    var author: String,
)