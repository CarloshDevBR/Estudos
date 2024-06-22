package exercicios

fun main() {
    val exp = !(2 * 4 >= 16 / 2 && 5 == 4 + 1)

    // !(2 * 4 >= 16 / 2 && 5 == 4 + 1)
    // !(8 >= 8 && 5 == 5)
    // !(T && T)
    // !T
    // F

    println(exp)
}