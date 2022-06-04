package kotl.oop.casses

import java.util.*

open class Emplooyee(val name: String, val post: String, val startYear: Int) {

    val experience: Int
        get() = Date().toInstant().toString().substring(0, 4).toInt() - startYear

    fun work() {
        println("Work")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Emplooyee

        if (name != other.name) return false
        if (post != other.post) return false
        if (startYear != other.startYear) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + post.hashCode()
        result = 31 * result + startYear
        return result
    }


}

fun main() {
    val emp = Emplooyee("Vasyan", "Dev", 2018)

    emp.work()

    emp.printInfo()

}

fun Emplooyee.printInfo() =
    println("Имя: ${this.name}\nДолжность: ${this.post}\nГод начала работы: ${this.startYear}\nСтаж: ${this.experience}")
