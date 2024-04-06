package lesson_10

fun main() {

    println("Введите логин")
    val loginFromUser = readln()

    println("Введите пароль")
    val passwordFromUser = readln()

    if (checkedLoginAndPassword(loginFromUser, passwordFromUser)){
        println("Добро пожаловать")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun checkedLoginAndPassword(login: String, password: String): Boolean {
    return login.length >= 4 && password.length >= 4
}
