package exercicios

fun main() {
    val p1 = Person(1000)

    p1.move()
    p1.move()
    p1.drinkWater()
    p1.move()
    p1.totalMeters()

    val p2 = Person(10000)

    p2.move()
    p2.move()
    p2.move()
    p2.move()
    p2.move()
    p2.move()
    p2.move()
    p2.move()
    p2.drinkWater()
    p2.move()
    p2.totalMeters()
}

class Person (private var limit: Int = 5000) {
    private var total: Int = 0
    private var meters: Int = 0

    fun move() {
        if (meters < limit) {
            println("Caminhando..")

            val moving = 1000

            meters += moving

            total += moving
        } else {
            println("Está exausto, beba água para continuar!")
        }
    }

    fun drinkWater() {
        println("Bebendo água...")

        meters = 0
    }

    fun totalMeters() {
        println("Total percorrido: $total metros")
    }
}