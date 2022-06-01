package kotl.functional_programming.zip

fun main() {
    val array: Array<String> = arrayOf("Vasya Pupkin", "Roman Zudaev", "Sergey Romancev", "Elena Belaya", "Mark Kurgaev")

    val pair: MutableList<Pair<String, String>> = array.map {
        Pair(it.substringAfter(" "), it.substringBefore(" "))
    }.toMutableList()

//    val pair:MutableList<Pair<String, String>> = mutableListOf()
//
//    for(e in array){
//        val tmp = e.split(" ")
//
//        pair.add(Pair(tmp[1], tmp[0]))
//    }


    for (i in pair) {
        println(i)
    }


}