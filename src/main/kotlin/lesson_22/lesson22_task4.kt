package lesson_22

fun main() {



}

class MainScreenViewModel() {

    private var mainScreenState = MainScreenState("")

    fun loadData() {
        mainScreenState = mainScreenState.copy("Данные отсутствуют")
        mainScreenState = mainScreenState.copy("Данные загружаются", isLoading = true)
        mainScreenState = mainScreenState.copy("Данные загружены")
    }


    data class MainScreenState(
        var data: String?,
        var isLoading: Boolean = false
    )
}