package kotl

fun main() {
    val count = 0
    val result = if(count < 0){
        "Это число меньше 0"
    }else if (count > 0){
        "Это число больше 0"
    } else {
        "Это число 0"
    }

    println(result)
}