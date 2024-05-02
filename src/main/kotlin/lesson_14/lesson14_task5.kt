package lesson_14

fun main() {

    val chat = Chat()
    chat.addMessage("Harry", "Hello Ron! How are you?")
    chat.addThreadMessage("Ron", "Harry", "I am fine! And you?")
    chat.addMessage("Germione", "What are you doing?")
    chat.addThreadMessage("Ron", "Germione", "We are fighting!")

    chat.printChat()

}

class Chat {

    private val listOfMessage = mutableListOf<Message>()

    fun addMessage(authorId: String, text: String): Message {
        val message = Message(authorId, text)
        listOfMessage.add(message)
        return message
    }

    fun addThreadMessage(authorId: String, parentMessageId: String, text: String): ChildMessage {
        val childMessage = ChildMessage(authorId, parentMessageId, text)
        listOfMessage.add(childMessage)
        return childMessage
    }

    fun printChat() {

        listOfMessage.groupBy { it.authorId }

        listOfMessage.forEach {
            println("${it.authorId} : ${it.text}")
        }
    }
}

open class Message(val authorId: String, val text: String)

class ChildMessage(authorId: String, val parentMessageId: String, text: String) : Message(authorId, text)


