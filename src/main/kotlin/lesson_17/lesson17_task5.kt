package lesson_17

fun main() {

    val user5 = User5("Robin", "qwerty123789456")
    println(user5.password)
    user5.password = "wert"

    user5.login = "Bobin"

}

class User5(
    private var _login: String,
    private var _password: String,
) {

    var login = _login
        set(value) {
            field = value
            println("Вы успешно изменили логин")
        }

    var password = _password
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")

}