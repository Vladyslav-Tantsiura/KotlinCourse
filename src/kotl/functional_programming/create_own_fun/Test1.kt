package kotl.functional_programming.create_own_fun

fun operate(list: List<Int>, operate: (List<Int>) -> Unit): Unit{
    operate(list)
}

fun main() {
    val list = listOf<Int>(1,5,8,0,3,2,6,9,8,79,23,4,234,32,4,32,4,4,3,24,)

    operate(list){ println(it.sum())}
}