package fundamentos.lambdas

fun main() {
    val string = "asdADSaD"

    // partition vai filtrar e dividir em dois a string
    // (f, s) é uma desestruturação do tipo pair
    val (f, s) = string.partition { it.isUpperCase() }

    println("First: $f")
    println("Second: $s")

    // Desestruturação em objetos (data class)
    val (result, status) = Result(1, "success")

    println("$result \n$status")
}

data class Result(val result: Int, val status: String)