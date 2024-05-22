package lesson_20

fun main() {

    val bender = Robot()

    bender.say()

    bender.setModifier { str: String -> str.reversed() }

    bender.say()

}

class Robot {

    private var modifier: (String) -> String = { it }

    fun say() {
        println(modifier(listOfPhrase.random()))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

val listOfPhrase = listOf(
    "Я люблю вас, мешки с костями",
    "Пока, начинки для гробов",
    "Выше нос, кусок мяса!",
    "Ну ничего, я создам свой модуль… С блэкджеком и шлюхами",
    "Укуси мой блестящий металлический зад!"
)