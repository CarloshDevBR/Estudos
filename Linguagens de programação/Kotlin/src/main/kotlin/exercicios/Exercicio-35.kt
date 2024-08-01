package exercicios

fun main() {
    val products = mapOf(
        "Alface" to 2.5,
        "Arroz" to 6.9,
        "Banana" to 4.8,
        "Sal" to 2.4
    )

    println("Maior preço: ${products.maxBy { it.value }.value}")

    println("Produto com o menor preço: ${products.minBy { it.value }.key}")

    println("Abaixo de 5.0: ${products.filter { it.value < 5 }.keys}")
}