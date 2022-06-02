package kotl.functional_programming.fun_with

val list:MutableList<Int>? = mutableListOf()

fun main() {
    list?.let {
        with(it) {
            for (i in 0..1000) {
                list.add((Math.random() * 1000).toInt())
            }
            println(filter { it % 2 == 0 }.take(100))
        }
    }
}