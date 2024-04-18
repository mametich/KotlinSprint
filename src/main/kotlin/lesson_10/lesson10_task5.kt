package lesson_10

fun main() {

    println("Введите Ваш логин:")
    val loginOfUser = readln()

    println("Введите Ваш пароль:")
    val passwordOfUser = readln()

    getListOfBasket(checkedLoginAndPassword(loginOfUser, passwordOfUser))

}

fun checkedLoginAndPassword(currentLogin: String, currentPassword: String): String? {
    val correctLogin = "user"
    val correctPassword = "qwerty"

    var token: String? = null
    val rangeOfToken = '0'..'Z'

    if (correctLogin == currentLogin && correctPassword == currentPassword) {
        for (i in 1..32) {
            token += rangeOfToken.random()
        }
        return token
    } else {
        return null
    }
}

fun getListOfBasket(token: String?): MutableList<String> {
    val listOfProduct = mutableListOf("apple", "banana", "mango")

    if (token != null) {
        println(listOfProduct)
    } else {
        println("Неправильный пароль")
    }
    return listOfProduct
}

