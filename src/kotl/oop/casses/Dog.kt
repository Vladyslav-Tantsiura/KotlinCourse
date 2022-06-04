package kotl.oop.casses

class Dog {
    var name: String = ""
        get() = if (field.length > 0) field.first().uppercase() + field.substring(1).lowercase()  else ""

    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var weight: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

}