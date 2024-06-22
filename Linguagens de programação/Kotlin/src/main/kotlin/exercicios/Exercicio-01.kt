package exercicios

import java.util.Scanner

fun main() {
    println("Digite seu nome: ")
    val name = readln().replaceFirstChar { it.uppercase() }

    println("Digite sua idade: ")
    val scanner = Scanner(System.`in`)
    val age = scanner.nextInt()

    println("Digite seu sobrenome: ")
    val lastName = readln().replaceFirstChar{ it.uppercase() }

    println("Seu nome é $name, e vc tem $age, certo? Seu sobrenome é ${lastName}")
}