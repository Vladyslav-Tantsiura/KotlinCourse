package kotl

fun crop(str: String) = str.substring(0, Math.min(5, str.length))

fun sum(vararg numbers: Int): Int {
    var sum = 0
    for (e in numbers){
        sum += e
    }
    return sum;
}

fun sort(numbers: List<Int>): List<Int>{
    val myList = numbers.toMutableList()

    for (i in 1 until myList.size){
        for(j in myList.size - 1 downTo i){
            if (myList[j] < myList[j - 1]) {
                val tmp = myList[j]
                myList[j] = myList[j - 1]
                myList[j - 1] = tmp
            }
        }
    }
    return myList.toList()
}

fun sort(numbers: Array<Int>) = sort(numbers.toList())

fun sort(vararg numbers: Int) = sort(numbers.toList())



fun main() {
    println(sort(listOf(5,7,-6,2,8,9,1,12,45)))
}