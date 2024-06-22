package exercicios

fun main() {
    val password: String? = null
    val defaultPassword: String = "abcde"

    val safeValue = 5

    val mask = "".padEnd((password ?: defaultPassword).length, '*')

    println(password ?: defaultPassword)
    println(mask)
}