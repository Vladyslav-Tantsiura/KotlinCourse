package kotl.oop.abstract_classes

class Car(name: String): Transport(name) {
    override fun drive() {
        println("Еду на $name")
    }

    fun startEngine(): Boolean{
        return Math.random() > 0.25
    }
}