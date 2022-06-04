package kotl.oop.enumeration

import kotl.oop.enumeration.Month.*

fun main() {
    val month: Month = May
    val result = when (month) {
        December, January, February -> "Winter"
        March, April, May -> "Spring"
        June, July, August -> "Summer"
        September, October, November -> "Autumn"
    }

    println(result)
}