package kotl.oop.abstract_classes

import kotl.oop.abstract_classes.DayOfWeek.*


class MyRandom {

    companion object{
        fun randomNum(from: Int, to:Int) = (Math.random() * (to - from + 1)).toInt() + from

        fun randomBoolean() = Math.random() > 5

        fun randomDayOfWeek()= when(randomNum(1,7)) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                7 -> SUNDAY
                else -> {
                    MONDAY
                }
            }.nameOfDay

    }
}

fun main() {
    println(MyRandom.randomNum(0, 15))
    println(MyRandom.randomBoolean())
    println(MyRandom.randomDayOfWeek())
}