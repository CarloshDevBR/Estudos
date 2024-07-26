package polimorfismo

fun main() {
    val square = Square()
    val triangle = Triangle()

    println(square.vertexNumber)
    println(triangle.vertexNumber)
}

abstract class Shape {
    open val vertexNumber: Int = 0
}

// Sobrescrevendo atributos

class Square : Shape() {
    override val vertexNumber: Int = 4
}

class Triangle : Shape() {
    override val vertexNumber: Int = 3
}