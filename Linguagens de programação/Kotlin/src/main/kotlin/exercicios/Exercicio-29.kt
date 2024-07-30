package exercicios

fun main() {
    val x = 10

    val res = runIfTrue(x > 5) { 10 * 1 }

    println(res)
}

// Generics
fun<T> runIfTrue(condition: Boolean, lambda: () -> T?): T? {
    if (condition) return lambda()

    return null
}