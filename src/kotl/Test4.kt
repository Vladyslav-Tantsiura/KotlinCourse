package kotl

fun main() {
//    val arrayOfNums:MutableList<Int> = mutableListOf()

//    for (i in 300..600)
//        arrayOfNums.add(i)

//    for(i in arrayOfNums.size - 1 downTo 0){
//        if(arrayOfNums[i] % 5 == 0){
//            println(arrayOfNums[i])
//        }
//    }

    val arrayOfNums = arrayOfNulls<Int>(301)

    for ((index, e) in (300..600).withIndex())
        arrayOfNums[index] = e

    for(i in arrayOfNums.size - 1 downTo 0 step 5){
        println(arrayOfNums[i])
    }
}