package exercicios
/*
    1. Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
    geométrica. Informar se formam um quadrado (lados iguais).

    2. Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
    se é um triângulo equilátero (todos os lados iguais.
*/

fun main() {
    val res1 = validateSquare()

    println(res1)

    val res2 = validateTriangle()

    println(res2)
}

fun validateSquare(): String {
    println("Square")
    val n1 = readln().toIntOrNull() ?: 0
    val n2 = readln().toIntOrNull() ?: 0

    return when {
        n1 == n2 -> "Lados iguais"
        else -> "Lados diferentes"
    }
}

fun validateTriangle(): String {
    println("Triangle")
    val n1 = readln().toIntOrNull() ?: 0
    val n2 = readln().toIntOrNull() ?: 0
    val n3 = readln().toIntOrNull() ?: 0

    return when {
        n1 == n2 && n1 == n3 -> "Lados iguais"
        else -> "Lados diferentes"
    }
}










