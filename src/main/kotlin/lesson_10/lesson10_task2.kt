package lesson_10

fun main() {

    println("Введите логин")
    val loginFromUser = readln()

    println("Введите пароль")
    val passwordFromUser = readln()

    println(checkedLoginAndPassword(loginFromUser, passwordFromUser))
}

fun checkedLoginAndPassword(login: String, password: String): String {
    val messageOfChecked = if (login.length >= 4 && password.length >= 4) {
        "Добро пожаловать"
    } else {
        "Логин или пароль недостаточно длинные"
    }
    return messageOfChecked
}
