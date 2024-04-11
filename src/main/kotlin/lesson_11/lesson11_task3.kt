package lesson_11

fun main() {

    val participant1 = Participant("Ted", "male")
    val participant2 = Participant("Harry", "male")
    val participant3 = Participant("Hermione", "shemale")

    val room = Room(
        cover = "Начинающий английский",
        nameOfRoom = "Давай разговаривать",
        listOfParticipant = mutableListOf(),
    )

    room.addParticipant(participant1)
    room.addParticipant(participant2)
    room.addParticipant(participant3)
    room.showParticipantInformation(participant1)
    room.updateNameAndStatusParticipant("Furrel", "shemale")
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
        name: String,
        status: String,
    ) {
        println("Введите имя:")
        val oldName = readln()
        listOfParticipant.find { it.name == oldName }?.name = name
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