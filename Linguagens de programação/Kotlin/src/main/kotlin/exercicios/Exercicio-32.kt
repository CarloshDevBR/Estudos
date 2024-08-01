package exercicios

fun main() {
    val map = mapOf(
        55 to "Brasil",
        351 to "Portugal",
        54 to "Argentina",
        1 to "United States"
    )
        .values
        .toMutableList()
        .sortedDescending()

    println(map)
}