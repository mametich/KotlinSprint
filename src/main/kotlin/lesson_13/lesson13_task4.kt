package lesson_13

fun main() {

    val listOfContact = mutableListOf<Contact4>()

    var nameOfContact = ""
    var numberOfContact: Long = 0
    val nameOfCompanyOfContact: String?

    println("Введите имя контакта")
    val nameFromUser = readlnOrNull()
    if (nameFromUser != null) {
        nameOfContact = nameFromUser
    }

    println("Введите номер контакта")
    val numberFromUser = readlnOrNull()?.toLongOrNull()
    if (numberFromUser != null) {
        numberOfContact = numberFromUser
    } else {
        println("Вы не ввели номер телефона")
    }

    println("Введите название компании")
    val nameOfCompanyFromUser = readlnOrNull()
    if (!nameOfCompanyFromUser.isNullOrEmpty()) {
        nameOfCompanyOfContact = nameOfCompanyFromUser
    } else {
        nameOfCompanyOfContact = null
    }

    val contact = Contact4(nameOfContact, numberOfContact, nameOfCompanyOfContact)
    listOfContact.add(contact)

    contact.printInformationAboutContact(listOfContact)
}


class Contact4(
    var name: String,
    var number: Long,
    var company: String?,
) {
    fun printInformationAboutContact(list: MutableList<Contact4>) {
        list.forEach {
            println("${it.name} ${it.number} ${it.company}")
        }
    }
}