package exercicios

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite um número")
    val n = scanner.nextInt()

    val res = n % 2

    if (res == 0) {
        println("Par")
    } else if (res == 1) {
        println("Impar")
    }
}