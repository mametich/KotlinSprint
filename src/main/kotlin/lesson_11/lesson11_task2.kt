package lesson_11

fun main() {

val user = User(
    id = 5,
    login = "Ted",
    password = "qwerty",
    email = "ted@mail.com",
    bio = "natural"
)

    user.changeThePassword()
    user.showUserInformation(user)
}

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {

    fun showUserInformation(user: User) {
        println(
            """
                user ID: ${user.id}
                user login: ${user.login}
                user password: ${user.password}
                user email: ${user.email}
                user bio: ${user.bio}
            """.trimIndent()
        )
    }

    fun writeInformationFromUserAboutBio() {
        val userInformationOfBio = readln()
        bio = userInformationOfBio
    }

    fun changeThePassword() {
        println("Введите текущий пароль:")
        val passwordFromUser = readln()
        if (passwordFromUser == password) {
            println("Введите новый пароль")
            val newPasswordFromUser = readln()
            password = newPasswordFromUser
            println("Ваш пароль изменен")
        }
    }
}
