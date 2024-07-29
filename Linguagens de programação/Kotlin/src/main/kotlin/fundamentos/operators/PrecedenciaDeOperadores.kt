package fundamentos.operators

fun main() {
    val exp = 5 + 4 - 3 * 2 * (1 + 1) / 3

    // 5 = 4 - 3 * 2 * 2 / 3
    // 5 + 4 - 6 * 2 / 3
    // 5 + 4 - 12 / 3
    // 5 + 4 - 4
    // 9 - 4
    // 5

    println(exp)

    val exp2 = true && false || true && !false

    // T && F || T && T
    // F || T
    // T

    println(exp2)

    val exp3 = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)

    // 8 * 2 < 30 / 2 || !(4 <= 2)
    // 16 < 30 / 2 || !(4 <= 2)
    // 16 < 15 || !(4 <= 2)
    // F || !F
    // F || T
    // T
}