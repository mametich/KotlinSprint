package lesson_11

fun main() {

    val participant1 = Participant("Ted", "male")

    val room = Room(
        cover = "Начинающий английский",
        nameOfRoom = "Давай разговаривать",
        listOfParticipant = mutableListOf(),
    )

    room.addParticipant(participant1)
    room.showParticipantInformation(participant1)
    room.updateNameAndStatusParticipant(participant1, "Furrel", "shemale")
    room.showParticipantInformation(participant1)

}

class Room(
    val cover: String,
    val nameOfRoom: String,
    val listOfParticipant: MutableList<Participant>,
) {

    fun addParticipant(participant: Participant)  {
        listOfParticipant.add(participant)
    }

    fun updateNameAndStatusParticipant(
        participant: Participant,
        name: String,
        status: String,
    ) {
        participant.name = name
        participant.status = status
    }

    fun showParticipantInformation(participant: Participant) {
        println(
            """
            Имя участника: ${participant.name} 
            Статус участника: ${participant.status}
        """.trimIndent()
        )
    }
}

class Participant(
    var name: String,
    var status: String,
)