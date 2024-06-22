package firstSteps

fun main() {
    val value: Int? = null

    // Ternário
    val value2 = if (value != null) value else 0
    println(value2)

    // Elvis operator
    val value3 = value ?: 0
    println(value3)
}