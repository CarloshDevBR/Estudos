package fundamentos.inputs

import java.util.Scanner

fun main() {
    println("Digite o seu nome: ")
    val name = readln() // Captura os dados do teclado
    println("Seu nome invertido é ${name.reversed()}")

    println("Digite dois números (Método readln)")
    println("> ")
    val n1 = readln().toInt()
    println("> ")
    val n2 = readln().toInt()
    println("A soma entre $n1 e $n2 é igual a ${n1 + n2}")

    println("Digite dois números (Método Scanner)")
    val scanner = Scanner(System.`in`)
    println("> ")
    val n3 = scanner.nextInt()
    println("> ")
    val n4 = scanner.nextInt()
    println("A soma entre $n3 e $n4 é igual a ${n3 + n4}")
}