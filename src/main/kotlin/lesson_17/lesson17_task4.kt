package lesson_17

fun main() {

    val parcel = Parcel(0,156,"Moscow")

    parcel.currentLocation = "Omsk"
    println(parcel.countOfMove)

    parcel.currentLocation = "Novgorod"
    println(parcel.countOfMove)

}

class Parcel(
    _countOfMove: Int,
    _numberOfPackage: Int,
    _currentLocation: String,
) {

    var countOfMove = _countOfMove

    var numberOfPackage = _numberOfPackage

    var currentLocation = _currentLocation
        set(value) {
            countOfMove++
            field = value
        }
}