package lesson_10

fun main() {

    println("Введите Ваш логин:")
    val loginOfUser = readln()

    println("Введите Ваш пароль:")
    val passwordOfUser = readln()

    getListOfBasket(checkedLoginAndPasswordAgain(loginOfUser, passwordOfUser).toString())
}

fun checkedLoginAndPasswordAgain(currentLogin: String, currentPassword: String) : Boolean {

    val correctLogin = "user"
    val correctPassword = "qwerty"
    var token: String? = null
    val rangeOfToken = (0..9) + ('a'..'z')

    if (correctLogin == currentLogin && correctPassword == currentPassword) {
        for (i in 1..32) {
            token += rangeOfToken.random()
        }
        return true
    } else {
        return false
    }
}

fun getListOfBasket(token: String?) : String {
    val listOfBasket = mutableListOf("apple", "banana", "mango")

    if (token != null) {
        println(listOfBasket)
    } else {
        println("Неправильный пароль")
    }
    return listOfBasket.toString()
}

