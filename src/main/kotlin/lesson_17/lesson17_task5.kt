package lesson_17

fun main() {

    val user5 = User5("Robin", "qwerty123")
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
            println("Вы успешно изменили пароль")
        }

    var password = _password
        get() = field[0].toString().padEnd(field.length, '*')
        set(value) = println("Вы не можете изменить пароль")

}