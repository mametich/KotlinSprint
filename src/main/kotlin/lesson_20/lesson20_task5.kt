package lesson_20

fun main() {

    println(say())
    println(reversedPhrase(listOfPhrase.random()))

}

fun say(): String {
    return listOfPhrase.random()
}

val reversedPhrase = { phrase: String ->
    phrase.reversed()
}

fun setModifier(modifier: (String) -> String) {
    modifier
}

val listOfPhrase = listOf(
    "Я люблю вас, мешки с костями",
    "Пока, начинки для гробов",
    "Выше нос, кусок мяса!",
    "Ну ничего, я создам свой модуль… С блэкджеком и шлюхами",
    "Укуси мой блестящий металлический зад!"
)