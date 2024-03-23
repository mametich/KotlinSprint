package lesson_6

fun main() {

       do {
           println("Придумайте логин:")
           val newLoginUser = readln()

           println("Придумайте пароль:")
           val newPasswordUser = readln()

           println("Укажите Ваш логин:")
           val registeredLoginUser = readln()

           println("Укажите Ваш пароль:")
           val registeredPasswordUser = readln()
       }

    while (newLoginUser != registeredLoginUser && newPasswordUser != registeredPasswordUser)
        println("Введите данные заново")

    println("Авторизация прошла успешно")
}
