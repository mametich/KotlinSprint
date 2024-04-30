package lesson_14

fun main() {

    val chat = Chat()
    chat.addMessage("Harry", "Hello Ron! How are you?")
    chat.addThreadMessage("Ron", "Harry", "I am fine! And you?")

    chat.printChat()

}

class Chat {

    private val listOfMessage = mutableListOf<Message>()

    fun addMessage(messageId: String, text: String) : Message {
        val message = Message(messageId, text)
        listOfMessage.add(message)
        return message
    }

    fun addThreadMessage(messageId: String, parentMessageId: String, text: String) : ChildMessage {
        val childMessage = ChildMessage(messageId, parentMessageId, text)
        listOfMessage.add(childMessage)
        return childMessage
    }

    fun printChat() {
        println("${listOfMessage.groupBy { it.messageId }}")
    }
}

open class Message(val messageId: String, val text: String)

class ChildMessage(messageId: String, val parentMessageId: String, text: String,) : Message(messageId,text)


