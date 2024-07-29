package fundamentos.lambdas

fun main() {
    // Função lambda
    val f2: (Int, Int) -> Int = { n1: Int, n2: Int -> n1 - n2 }

    f2(2, 3)
}