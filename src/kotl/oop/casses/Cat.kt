package kotl.oop.casses

class Cat(val name:String, var age: Int = 0, var weight: Float = 0f) {

    fun printInfo(){
        println("Имя кошки: $name\nВозраст кошки: $age\nВес кошки: $weight")
    }


}

fun main() {
    val c = Cat("Барсик", 10, 2f)
    c.printInfo()

    println(c.isOld())
}

fun Cat.isOld(): Boolean{
    return age > 12
}