package exercicios

fun main() {
    val numbers = listOf(1, 7, 14, 62, 8, 12).associateWith { it + 1 }.toSortedMap()

    println(numbers)
}