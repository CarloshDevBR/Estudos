package exercicios

fun main() {
    val n1 = readln().toIntOrNull() ?: 0
    val n2 = readln().toIntOrNull() ?: 0

    val res = sub(n1, n2)

    println(res)
}

fun sub(n1: Int, n2: Int): Int {
    return try {
        n1 / n2
    } catch (err: ArithmeticException) {
        0
    }
}