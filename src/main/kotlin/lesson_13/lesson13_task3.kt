package lesson_13

fun main() {

    val listOfContacts = mutableListOf<Contact>(
        Contact("Harry", 86541237986, null),
        Contact("Ron", 896532124578, null),
        Contact("Germiona", 875421326589, "Griffindorf"),
        Contact("Nevil", 546132546789, "null"),
        Contact("Draco", 456123264579, "Slytherin")
    )

    val listOfCompany = listOfContacts.mapNotNull { it.company }
    println(listOfCompany)

}

class Contact(
    var name: String,
    var number: Long,
    var company: String?,
)