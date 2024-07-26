package exercicios

fun main() {
    val r = Rect(4.0, 10.0)

    println(r)
}

data class Rect(
    private val left: Double,
    private val right: Double
) {
    init {
        require(left > 0 && right > 0) { "Invalid value" }
    }
}