package lesson_6

fun main() {

    println("Придумайте логин:")
    val newLoginUser = readLine()!!

    println("Придумайте пароль:")
    val newPasswordUser = readLine()!!

    println("Укажите Ваш логин:")
    val registeredLoginUser = readLine()!!

    println("Укажите Ваш пароль:")
    val registeredPasswordUser = readLine()!!

    var isCheckedLoginAndPassword = newLoginUser != registeredLoginUser || newPasswordUser != registeredPasswordUser

    while (isCheckedLoginAndPassword) {
      println("Введите данные заново")
            isCheckedLoginAndPassword = false

    }
}