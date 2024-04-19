package lesson_11

fun main() {

    val forum = Forum()

    val harry = forum.createMemberOfForum("Harry")
    val ron = forum.createMemberOfForum("Ron")

    forum.createMessage(harry.userId, "Hello Ron!")
    forum.createMessage(ron.userId, "Hello Harry!")

    forum.printThread()

}

class Forum {

    private val listOfMember = mutableListOf<MemberOfForum>()
    private val listOfMessages = mutableListOf<Message>()

    fun createMemberOfForum(name: String): MemberOfForum {
        var idForMember = ""
        val rangeOfSymbolsForId = '0'..'Z'
        for (i in 1..9) {
            idForMember += rangeOfSymbolsForId.random()
        }
        val memberOfForum = MemberOfForum(idForMember, name)
        listOfMember.add(memberOfForum)

        return memberOfForum
    }

    fun createMessage(userId: String, text: String): Message {
        val message = Message(userId, text)
        listOfMessages.add(message)

        return Message(userId, text)
    }

    fun printThread() {
        listOfMessages.forEach {
            println(
                """
                    ${it.authorId} : ${it.message}
                """.trimIndent()
            )
        }
    }
}

class MemberOfForum(
    var userId: String,
    var userName: String,
)

class Message(
    var authorId: String,
    var message: String,
)







