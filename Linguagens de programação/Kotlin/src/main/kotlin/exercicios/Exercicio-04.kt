package exercicios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite um número de 0 até 10")
    var n = scanner.nextByte()

    if (n > 10) {
        n = 10
    }

    val res = n * n

    println("O valor $n multiplicado fica $res")
}