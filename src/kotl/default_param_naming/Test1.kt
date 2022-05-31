package kotl.default_param_naming

fun parallelepipedVolume(a: Int, b: Int = a, c: Int = a) = println("Volume of parallelepiped = ${a * b * c}")

fun main() {
    parallelepipedVolume(3)
}