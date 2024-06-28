package classes

fun main() {
    // Com o companion object não é necessário criar uma instancia
    println(Math.sum(12, 15))
    println(Math.mult(12, 15))

    // Fora do companion object é necessário instanciar a classe para chamar o método
    println(Math().sub(5, 5))
}

private class Math(
    // Atributo da classe Math fora do companion object
    val x: Int = 0
) {
    fun sub(a: Int, b: Int) = a - b

    // Companion object fica fora do contexto de instancia então não consegue acessar o atributo x
    companion object {
        fun sum(a: Int, b: Int) = a + b

        fun mult(a: Int, b: Int) = a * b
    }
}