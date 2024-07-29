package fundamentos.types

/*
    Any - É um supertipo de todos os outros fundamentos.tipos de classe. Isso significa que
    qualquer tipo em Kotlin herda de Any
*/

fun main() {
    printAny("Hello world!")
    printAny(123)
    printAny(true)
}

private fun printAny(value: Any) {
    println(value.toString())
}