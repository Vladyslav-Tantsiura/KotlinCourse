package kotl.functional_programming.filter_and_map

fun main() {
    val employeeList = generateSequence("Сотрудник №1", {
        val index = it.substring(11).toInt()

        "Сотрудник №${index + 1}"
    })

    for(employee in employeeList.take(10)){
        println(employee)
    }
}
