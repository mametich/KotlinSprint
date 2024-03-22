package lesson_5

private const val NAME_OF_REGISTERED_USER = "Zaphod"
private const val PASSWORD_OF_REGISTERED_USER = "PanGalactic"

fun main() {

println("""
    Внимание, пассажир. Моя обязанность, как обычно, незавидная, 
    - приветствовать вас на борту корабля "Heart of Gold". [вздыхает...] 
    Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
    Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. 
    [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные...
""".trimIndent())

    val nameOfNewUser = readLine() ?: ""
    if (nameOfNewUser == NAME_OF_REGISTERED_USER){
        println("Просьба ввести пароль: ")
    } else {
        println("Просьба зарегистрироваться!")
    }

    val passwordOfNewUser = readLine() ?: ""
    if (passwordOfNewUser == PASSWORD_OF_REGISTERED_USER){
        println("""
            [вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
            Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
            Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... 
            [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent())
    } else {
        println("Не правильно введен пароль!")
    }

}