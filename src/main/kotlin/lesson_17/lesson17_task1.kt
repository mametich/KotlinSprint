package lesson_17

fun main() {



}

class Quiz(
    var _question: String,
    var _answer: String,
) {
    var question = _question
        get() = field
    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}