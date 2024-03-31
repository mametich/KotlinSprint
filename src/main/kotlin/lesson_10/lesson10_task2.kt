package lesson_10

fun main() {

    println("Введите логин")
    val loginFromUser = readln()

    println("Введите пароль")
    val passwordFromUser = readln()

    val loginAndPasswordFromUser = loginFromUser + passwordFromUser

    println(checkedLoginAndPassword(loginAndPasswordFromUser))

}

fun checkedLoginAndPassword(loginAndPassword: String): String {
    val arrayOfLoginOrPassword = loginAndPassword.toCharArray()
    val messageOfChecked = if (arrayOfLoginOrPassword.size + 1 > 8) {
        "Добро пожаловать"
    } else {
        "Логин или пароль недостаточно длинные"
    }
    return messageOfChecked
}
