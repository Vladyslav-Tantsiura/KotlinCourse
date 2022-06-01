package kotl.functional_programming.filter_and_map

fun main() {
    val listOfNames = listOf<String>("Armin", "Worker", "Ameli", "Murse", "Kodi", "Marks", "Aiger", "Smith", "Morse")

    val listOfNamesWhichStartWithA = listOfNames.filter { it[0] == 'A' }

    val sortedListOfNames = listOfNames.sorted()

    val newListOfNames = listOfNames.sortedDescending()

    println(newListOfNames)
}