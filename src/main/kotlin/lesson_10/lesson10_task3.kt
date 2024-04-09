package lesson_10

fun main() {

    println("Введите длину пароля (цифру от 0 до 9)")
    val lengthOfPassword = readln().toInt()

    val passwordForUser = generationOfPasswords(lengthOfPassword)
    println("Ваш пароль: ${passwordForUser.take(lengthOfPassword)}")
}

fun generationOfPasswords(number: Int): String {
    var password = ""
    val rangeOfPassword = 0..9
    val rangeOfSpecialSymbols = '!'.. '\''

    for (i in 1..number) {
        password += rangeOfPassword.random()
        password += rangeOfSpecialSymbols.random()
    }
    return password
}