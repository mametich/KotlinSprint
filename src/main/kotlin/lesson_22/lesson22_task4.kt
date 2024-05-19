package lesson_22

fun main() {

var mainScreenViewModel = MainScreenViewModel(
    mainScreenState = MainScreenViewModel.MainScreenState(
        "", false
    )
)
    println(mainScreenViewModel.loadData(MainScreenViewModel.StateOfData.SUCCESS))

}

class MainScreenViewModel(
    private var mainScreenState: MainScreenState,
) {
    fun loadData(stateOfData: StateOfData) : MainScreenState {
        mainScreenState = when(stateOfData) {
            StateOfData.SUCCESS -> MainScreenState("Данные загружены", false)
            StateOfData.IS_LOADING -> MainScreenState("Загрузка данных", true)
            StateOfData.ERROR -> MainScreenState("Ошибка", true)
        }
        return mainScreenState
    }


    enum class StateOfData {
        SUCCESS,
        IS_LOADING,
        ERROR
    }

    data class MainScreenState(
        var data: String?,
        var isLoading: Boolean = false
    )
}