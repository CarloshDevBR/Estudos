package exercicios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("> ")
    val n1 = scanner.nextDouble()

    println("> ")
    val operator = readln()[0]

    println("> ")
    val n2 = scanner.nextDouble()

    val res = when (operator) {
        '+' -> n1 + n2
        '-' -> n1 - n2
        '*' -> n1 * n2
        '/' -> n1 / n2
        else -> 0
    }

    println("Resultado: ${res}")
}