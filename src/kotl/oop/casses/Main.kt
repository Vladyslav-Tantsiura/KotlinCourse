package kotl.oop.casses

fun main() {
    val adress1 = Adress("Kiev", "Proletarska st.", 40)

    val adress2 = adress1.copy()

    println(adress1)
    println(adress2)

    println(adress1.hashCode())
    println(adress2.hashCode())

    println(adress1 == adress2)

    val (city1, street1, streetNum1) = adress1
    val (city2, street2, streetNum3) = adress2

}