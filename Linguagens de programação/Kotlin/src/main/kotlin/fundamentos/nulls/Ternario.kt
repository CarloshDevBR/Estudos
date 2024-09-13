package fundamentos.nulls

fun main() {
    val value: Int? = null

    // Não existe ternário no Kotlin mas temos essa abreviação do if/else
    val value2 = if (value != null) value else 0
    println(value2)

    // Elvis operator
    val value3 = value ?: 0
    println(value3)
}