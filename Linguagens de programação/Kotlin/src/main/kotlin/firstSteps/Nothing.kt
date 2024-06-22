package firstSteps

/*
    Nothing - Representa um valor que nunca existe
*/

fun main() {
    fail("Erro fatal!")
    println("Isso nunca será impresso.")

    // Também é utilizado com o TODO
    // TODO()
}

private fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}