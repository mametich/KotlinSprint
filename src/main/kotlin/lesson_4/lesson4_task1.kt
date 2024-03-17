package lesson_4

private var QUANTITY_OF_TABLES = 13

fun main() {


    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    val isReservedAllTablesToday = QUANTITY_OF_TABLES == reservedTablesToday
    val isReservedAllTablesTomorrow = QUANTITY_OF_TABLES == reservedTablesTomorrow

        println("Доступность столиков на сегодня: $isReservedAllTablesToday,\n" +
                "Доступность столиков на завтра: $isReservedAllTablesTomorrow.")

}