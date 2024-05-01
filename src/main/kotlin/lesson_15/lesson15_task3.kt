package lesson_15

fun main() {

    val user = User("Привет! Как дела?", "Гарри")
    val administrator = Administrator("Все хорошо! У тебя как?", "Рон")

    user.readMessage()
    user.sendMessage()

    administrator.readMessage()
    administrator.sendMessage()
    administrator.deleteUser()
    administrator.deleteMessage()

}

abstract class Account(
    val text: String,
    val userId: String,
) {

    abstract fun readMessage()
    abstract fun sendMessage()

}

class User(
    text: String,
    userId: String,
) : Account(text, userId) {
    override fun readMessage(){
        println("Пользователь прочитал сообщение")
    }

    override fun sendMessage() {
        println("Пользователь отправил сообщение")
    }

}

class Administrator(
    text: String,
    userId: String,
) : Account(text, userId) {

    override fun readMessage() {
        println("Администратор читает сообщение")
    }

    override fun sendMessage() {
        println("Администратор отправил сообщение")
    }

    fun deleteUser() {
        println("Пользователь удален")
    }

    fun deleteMessage() {
        println("Сообщение удалено")
    }
}

