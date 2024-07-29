package fundamentos.lambdas

fun main() {
    // Função anônima
    val f1 = fun (n1: Int, n2: Int): Int {
        return n1 + n2
    }

    // Executa a função anônima
    f1.invoke(2, 3)
    f1(2, 3)
}