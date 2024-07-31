package exercicios

fun main() {
    var total = 0.0

    val circles = arrayOf(
        Circle(2.4),
        Circle(5.5),
        Circle(10.5),
        Circle(6.1),
        Circle(7.8)
    )

    for (i in circles.indices) {
        total += circles[i].surface()
    }

    repeat(circles.size) {
        val circle = circles[it]
        val surface = circle.surface()
        println(surface)
    }

    circles.forEach { total += it.surface() }

    println(total)
}

class Circle(private val radius: Double) {
    fun surface(): Double = Math.PI * radius * radius
}