package fundamentos.nulls

fun main() {
    val str: String? = null

    // Let só é executado se caso o str seja diferente de null
    str?.let {
        it.length
        it.lowercase()
    }
}