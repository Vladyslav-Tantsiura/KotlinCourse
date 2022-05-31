package kotl.functional_programming.lymbdas

val square = { a: Int -> a * a }
//val square: (Int)-> Int = {a -> a*a}

val perimetr: (Int, Int) -> Int = { a, b -> 2 * a + 2 * b }

val greet: (String) -> Unit = { println(it) }

val reverseSort: (Array<Int>) -> Array<Int> = {
    for (i in 1 until it.size) {
        for (j in it.size - 1 downTo i) {
            if (it[j] < it[j - 1]) {
                val tmp = it[j]
                it[j] = it[j - 1]
                it[j - 1] = tmp
            }
        }
    }
    it
}

fun main() {
    println(square(4))
}