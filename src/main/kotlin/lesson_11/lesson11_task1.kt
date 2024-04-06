package lesson_11

fun main() {

    val user1 = User(
        id = 5,
        login = "Kira",
        password = "qwerty",
        email = "kira@mail.com"
    )

    val user2 = User(
        id = 1,
        login = "Ted",
        password = "zxcvb",
        email = "ted@mail.com"
    )
    
    println(
        """
        user1 ID: ${user1.id}
        user1 login: ${user1.login}
        user1 password: ${user1.password}
        user1 email:  ${user1.email}
    """.trimIndent()
    )

    println(
        """
        user2 ID: ${user2.id}
        user2 login: ${user2.login}
        user2 password: ${user2.password}
        user2 email:  ${user2.email}
    """.trimIndent()
    )
}

class User(
    var id: Int,
    var login: String,
    var password: String,
    var email: String,
)
