package lesson_16

fun main() {

    val user = User("Harry", "qwerty123")
    println(user.checkedPassword("qwerty"))

}

class User(
    val login: String,
    private val password: String,
) {
    fun checkedPassword(passwordFromUser: String): Boolean {
        return password == passwordFromUser
    }

}