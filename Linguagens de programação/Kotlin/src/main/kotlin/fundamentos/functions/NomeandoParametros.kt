package fundamentos.functions

fun main() {
    pow(3.0, 2)

    // Nomeando os argumentos vc pode definir em qualquer ordem
    pow(exp = 2, base = 3.0)
}

private fun pow(base: Double, exp: Int): Double {
    var r = base

    for (n in 2..exp) {
        r += base
    }

    return r
}