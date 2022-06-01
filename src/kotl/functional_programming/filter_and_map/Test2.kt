package kotl.functional_programming.filter_and_map

val listOfNums = (0..100).toList()


fun main() {
    val stringInterpretationOfNumsList: List<String>

    stringInterpretationOfNumsList = listOfNums.map { "This is $it number" }

    for (i in stringInterpretationOfNumsList){
        println(i)
    }
}