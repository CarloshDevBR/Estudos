package fundamentos.lambdas

fun main() {
    val f1: (Int) -> Int = { x -> x * 5 }

    // Usando o parametro it padrão do kotlin
    val f2: (Int) -> Int = { it * 5 }

    f1(10)

    f2(5)
}