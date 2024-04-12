package lesson_10

fun main() {

    println("Введите логин:")
    val newLoginFromUser = readln()

    println("Введите пароль:")
    val newPasswordFromUser = readln()

    println("Введите Ваш логин:")
    val loginOfUser = readln()

    println("Введите Ваш пароль:")
    val passwordOfUser = readln()

    println(
        checkedLoginAndPasswordAgain(newLoginFromUser, newPasswordFromUser, loginOfUser, passwordOfUser)
    )
}

fun checkedLoginAndPasswordAgain(
    login: String,
    password: String,
    currentLogin: String,
    currentPassword: String
): String {
    if (login == currentLogin && password == currentPassword) {
        var token = ""
        val rangeOfToken = (0..9) + ('a'..'z')
        for (i in 1..32) {
            token += rangeOfToken.random()
        }
        return token
    } else {
        return "Вы неправильно ввели пароль"
    }

}
