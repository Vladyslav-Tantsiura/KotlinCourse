package kotl.functional_programming

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )

    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>): Unit {
    val correctReports = data.filter { it.value.all { it > 0 } }
    val inCorrectReports = data.filter { it.value.any { it < 0 } }

    val averageForWeek = correctReports.flatMap { it.value }.average()
    val averageForMonth = correctReports.map { it.value.sum() }.average()
    val maxForMonth = correctReports.map { it.value.sum() }.maxOf { it }
    val minForMonth = correctReports.map { it.value.sum() }.minOf { it }
    val monthWithMaxProfit = correctReports.filter { it.value.sum() == maxForMonth }.keys
    val monthWithMinProfit = correctReports.filter { it.value.sum() == minForMonth }.keys

    println("Средняя выручка в неделю: $averageForWeek")
    println("Средняя выручка в месяц: $averageForMonth")
    println("Максимальная выручка в месяц: $maxForMonth")
    println("Была в следуйщих месяцах: $monthWithMaxProfit")
    println("Минимальная выручка в месяц: $minForMonth")
    println("Была в следуйщих месяцах: $monthWithMinProfit")
    println("Ошибки произошли в следуйщих месяцах: ${inCorrectReports.map { it.key }}")
}