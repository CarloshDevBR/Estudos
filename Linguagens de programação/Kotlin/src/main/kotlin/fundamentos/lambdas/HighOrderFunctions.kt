package fundamentos.lambdas

fun main() {
    val f1 = transformAndConvert("$", "|", 100, { v -> v * v })

    // Trailing lambda (expressão lambda fora dos parenteses)
    val f2 = transformAndConvert("$", "|", 5) { v -> -v }

    println(f1)

    println(f2)
}

fun transformAndConvert(prefix: String, suffix: String, value: Int, t: (Int) -> Int): String {
    val transformed = t(value)

    return "$prefix$transformed$suffix"
}