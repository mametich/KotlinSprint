package lesson_18

fun main() {

val order1 = Order1()
    order1.showInformationAboutOrder(15, "Банан")
    order1.showInformationAboutOrder(68, listOf("Картошка", "помидор", "лук"))

}

class Order1 {

    fun showInformationAboutOrder(numberOfOrder: Int, nameOfProduct: String) {
        println("Номер заказа: $numberOfOrder\nЗаказан товар: $nameOfProduct")
    }

    fun showInformationAboutOrder(numberOfOrder: Int, listOfProduct: List<String>) {
        println("Номер заказа: $numberOfOrder\nЗаказан товар: $listOfProduct")
    }

}