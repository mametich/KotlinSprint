package lesson_10

fun main() {

    println("Введите длину пароля (цифру от 0 до 9)")
    val lengthOfPassword = readln().toInt()

    val passwordForUser = generationOfPasswords(lengthOfPassword)
    println(passwordForUser)
}

fun generationOfPasswords(number: Int): String {
    var password = ""
    val rangeOfPassword = (0..9)
    val arrayOfSymbols = arrayOf(
        '!', '"', '#', '$', '%', '&', '/', '(', ')', '*', '+', ',', '-', '.', '/', '\''
    )

    for (i in 0..number) {
        password += rangeOfPassword.random()
        password += arrayOfSymbols.random()
    }
    return password.take(number)
}