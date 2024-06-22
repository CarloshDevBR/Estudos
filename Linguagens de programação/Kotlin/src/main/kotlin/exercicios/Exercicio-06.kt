package exercicios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite sua idade")
    val age = scanner.nextByte()

    when {
        age >= 0 && age <= 12 -> println("CRIANÇA")

        age >= 13 && age <= 17 -> println("ADOLESCENTE")

        age >= 18 && age <= 65 -> println("ADULTO")

        age >= 66 -> println("SÊNIOR")
    }
}
