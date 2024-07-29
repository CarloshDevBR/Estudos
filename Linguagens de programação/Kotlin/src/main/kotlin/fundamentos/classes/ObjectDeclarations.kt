package fundamentos.classes

fun main() {
    Math2.sum(1, 2)
    Math2.mult(2, 2)
    Math2.pi
}

// Object declarations mantem uma única instancia da classe
// Object declarations não suporta construtores
// Atributos e metodos podem ser criados
object Math2 {
    val pi = 3.1416

    fun sum(a: Int, b: Int) = a + b

    fun mult(a: Int, b: Int) = a * b
}