package kotl

val v1: Int? = 4
val v2: Int? = null
val v3: Int? = 6


fun main(){

    val result = (v1?:0) + (v2?:0) + (v3?:0)
    println("Sum of all values = $result")
}