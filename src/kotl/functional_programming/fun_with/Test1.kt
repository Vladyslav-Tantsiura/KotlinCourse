package kotl.functional_programming.fun_with

fun main() {
    val list = mutableListOf<Int>()

    for(i in 0..1000){
        list.add((Math.random() * 100).toInt())
    }
    println("Sum of all numbers ${list.sum()}")
    println("Max value is ${list.maxOf { it }}")
    println("Min value is ${list.minOf { it }}")
    println("Average vale is ${list.average()}")
    println("First element is ${list.first()}")
    println("Last element is ${list.last()}")
}