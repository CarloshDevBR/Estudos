package fundamentos.condicionals

fun main() {
    val name = "Carlos Henrique"
    val age = 22

    if (age >= 18) {
        println("$name, tem mais de 18 anos.")
    } else if (age <= 22) {
        println("$name, tem menos de 22 anos.")
    }
}