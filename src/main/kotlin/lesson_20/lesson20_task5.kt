package lesson_20

fun main() {

    val bender = Robot()
    println(bender.say())



}

class Robot(
    private var modifier: (String) -> String = { it }
) {

    fun say() : String {
        return reversedPhrase(listOfPhrase.random())
    }

    val reversedPhrase = { phrase: String ->
        phrase.reversed()
    }

    fun setModifier(modifier: (String) -> String) {
        reversedPhrase
    }

}

val listOfPhrase = listOf(
    "Я люблю вас, мешки с костями",
    "Пока, начинки для гробов",
    "Выше нос, кусок мяса!",
    "Ну ничего, я создам свой модуль… С блэкджеком и шлюхами",
    "Укуси мой блестящий металлический зад!"
)