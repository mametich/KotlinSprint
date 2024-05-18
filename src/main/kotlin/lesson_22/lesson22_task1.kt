package lesson_22

fun main() {

    val regularBook1 = RegularBook("Гарри Поттер", "Джоан Роулинг")
    val regularBook2 = RegularBook("Гарри Поттер", "Джоан Роулинг")

    val dataBook1 = DataBook("Песнь льда и пламени", "Джордж Мартин")
    val dataBook2 = DataBook("Песнь льда и пламени", "Джордж Мартин")


    // в обычном классе сравнивается объекты сравниваются по ссылкам, два объекта две разные ссылки
    println(regularBook1 == regularBook2)

    //в дата классе сравнивается содержимое объектов
    println(dataBook1 == dataBook2)
}


class RegularBook(
    var name: String,
    var author: String,
)

data class DataBook(
    var name: String,
    var author: String,
)