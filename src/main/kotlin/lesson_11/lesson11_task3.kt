package lesson_11

fun main() {

    val room = Room(
        cover = "Начинающий английский",
        nameOfRoom = "Давай разговаривать",
        listOfParticipant = mutableListOf(),
    )

    room.addParticipant(participant = Participant("Ted"))


}

class Room(
    var cover: String,
    var nameOfRoom: String,
    var listOfParticipant: MutableList<Participant>,
) {

    fun addParticipant(participant: Participant)  {
        listOfParticipant.add(participant)
    }

    fun updateNameAndStatusParticipant(
        name: String,
        status: String,
    ) {

    }

    fun showParticipantInformation(participant: Participant) {
        println(
            """
            Имя участника: ${participant.name} 
            Статус участника: ${participant.status.random()}
        """.trimIndent()
        )
    }
}

class Participant(
    var name: String,
    var status: List<String> = listOf(
        "разговаривает",
        "микрофон выключен",
        "пользователь заглушен"
    )
)