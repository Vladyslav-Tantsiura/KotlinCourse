package kotl.oop.abstract_classes

class Bicycle(name: String): Transport(name){
    override fun drive() {
        println("Еду на $name")
    }
}