package kotl.oop.casses

class Adress(val city: String, val street: String, val streetNum: Int) {
    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = streetNum

    fun copy(city: String = this.city, street: String = this.street, streetNum: Int = this.streetNum): Adress {
        return Adress(city, street, streetNum)
    }

    override fun toString(): String {
        return "Adress(city=$city, street=$street, streetNum=$streetNum)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Adress

        if (city != other.city) return false
        if (street != other.street) return false
        if (streetNum != other.streetNum) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + streetNum
        return result
    }
}