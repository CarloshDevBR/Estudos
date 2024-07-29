package fundamentos.nulls

fun main() {
    val n1: Byte? = null

    // Not null assertion garante que nunca será null
    val f = n1!!.toFloat()
    // Pode causar NullPointerException

    println(f)
}