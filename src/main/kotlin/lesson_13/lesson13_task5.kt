package lesson_13

import kotlin.NumberFormatException

fun main() {

    var numberOfContact: Long? = 0

    println("Введите номер контакта")
    val numberFromUser = readlnOrNull()
    try {
        numberOfContact = numberFromUser?.toLong()
    } catch (e: Exception) {
        println("Вы ввели буквы")
    }


    class Contact5(
        val name: String,
        val number: Long,
        val company: String?,
    ) {
        fun printInformationAboutContact(list: MutableList<Contact5>) {
            list.forEach {
                println("${it.name} ${it.number} ${it.company}")
            }
        }
    }
}