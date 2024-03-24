package lesson_6

fun main() {

    println("Придумайте логин:")
    val newLoginUser = readln()

    println("Придумайте пароль:")
    val newPasswordUser = readln()


    do {
        println("Укажите Ваш логин:")
        val registeredLoginUser = readln()

        println("Укажите Ваш пароль:")
        val registeredPasswordUser = readln()

        val isCheckedInformationFromUser =
            newLoginUser == registeredLoginUser &&
            newPasswordUser == registeredPasswordUser
    } while (!isCheckedInformationFromUser)

    println("Авторизация прошла успешно")
}

