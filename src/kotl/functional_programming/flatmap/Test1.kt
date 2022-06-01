package kotl.functional_programming.flatmap

fun main() {
    val myMap = mutableMapOf<String, Int>(
            Pair("key1", 1),
            "key2" to 2
    )
    myMap.put("key3", 3)

    for (i in myMap)
        println("Key = ${i.key} / Value = ${i.value}")


}