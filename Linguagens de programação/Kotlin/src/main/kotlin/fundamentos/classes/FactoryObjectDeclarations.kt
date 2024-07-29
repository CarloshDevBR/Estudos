package fundamentos.classes

fun main() {
    val car1 = Factory.newCar()
    val car2 = Factory.newCar()
    val car3 = Factory.newCar()

    println(Factory.newCar()) // 3
}

private object Factory {
    private var instanceCount = 0

    fun newCar(): Car {
        instanceCount++

        return Car()
    }
}

class Car