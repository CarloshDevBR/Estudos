package exceptions

fun main() {
    val i: Int? = null

    val b = i?.toDouble() ?: throw IllegalArgumentException()

    println(b)
}