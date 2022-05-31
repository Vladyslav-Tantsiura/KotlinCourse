package kotl

fun main() {
    val time = 3
    val weatherIsGood = true

    val toDo = when {
        time !in (6..22) -> "Sleep"
        time in (6..22) && weatherIsGood -> "Walk"
        time in (6..22) && !weatherIsGood -> "Read book"
        else -> "Incorrect data"
    }

    println(toDo)
}