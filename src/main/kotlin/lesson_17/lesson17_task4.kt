package lesson_17

fun main() {

    val parcel = Parcel()

    parcel.currentLocation = "Omsk"
    println(parcel.countOfMove)

    parcel.currentLocation = "Novgorod"
    println(parcel.countOfMove)

}

class Parcel(
    private var _countOfMove: Int = 0
) {

    var countOfMove = _countOfMove

    var numberOfPackage: Int = 0

    var currentLocation: String = "Moscow"
        set(value) {
            countOfMove++
            field = value
        }
}