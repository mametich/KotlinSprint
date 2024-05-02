package lesson_16

fun main() {

    val order = Order()
    order.changeStatusOfOrder("Готовиться")
    println(order.getInformationAboutStatus())

    order.changeStatusOfOrder("Готов")
    println(order.getInformationAboutStatus())

}

class Order {

    private val numberOfOrder: Int = 0
    private var statusOfOrder: String = ""

    fun changeStatusOfOrder(status: String) {
        statusOfOrder = status
    }

    fun getInformationAboutStatus() = statusOfOrder
}