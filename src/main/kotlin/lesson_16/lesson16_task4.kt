package lesson_16

fun main() {

    val order = Order()
    order.sendRequestToManager("Готовиться")
    println(order.getInformationAboutStatus())

    order.sendRequestToManager("Готов")
    println(order.getInformationAboutStatus())

}


class Order {

    private val numberOfOrder: Int = 0
    private var statusOfOrder: String = ""


    fun sendRequestToManager(request: String) {
        changeStatusOfOrder(request)
    }

    private fun changeStatusOfOrder(status: String) {
        statusOfOrder = status
    }

    fun getInformationAboutStatus() = statusOfOrder
}