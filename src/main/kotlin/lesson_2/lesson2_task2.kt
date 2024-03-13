package lesson_2

fun main() {

    val quantityOfPermanentEmployees = 50
    val salaryOfOnePermanentEmployee = 30000

    val quantityOfInterns = 30
    val salaryOfOneInterns = 20000

    val salariesOfPermanentEmployees = quantityOfPermanentEmployees * salaryOfOnePermanentEmployee
    val allSalaries = salariesOfPermanentEmployees + quantityOfInterns * salaryOfOneInterns
    val averageSalaryOfOnePermanentEmployees = allSalaries / quantityOfPermanentEmployees


    println(
        """
            Общая зарплата постоянных сотрудников: $salariesOfPermanentEmployees
            Общие расходы по ЗП после прихода стажеров: $allSalaries
            Средняя ЗП одного сотрудника после прихода стажеров: $averageSalaryOfOnePermanentEmployees
        """.trimIndent()
    )

}