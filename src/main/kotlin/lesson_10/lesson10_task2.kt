package lesson_10

fun main() {

    println("Введите логин")
    val loginFromUser = readln()

    println("Введите пароль")
    val passwordFromUser = readln()

    println(checkedLoginAndPassword(loginFromUser, passwordFromUser))
}

fun checkedLoginAndPassword(login: String, password: String): String {
    val arrayOfLogin = login.toCharArray()
    val arrayOfPassword = password.toCharArray()
    val messageOfChecked = if (arrayOfLogin.size + 1 > 4 && arrayOfPassword.size + 1 > 4) {
        "Добро пожаловать"
    } else {
        "Логин или пароль недостаточно длинные"
    }
    return messageOfChecked
}
