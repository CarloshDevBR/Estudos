package exercicios2

/*
     1. Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
     7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?

     2. FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
         a. Quando um número for divisível por 3, imprimir Buzz.
         b. Quando um número for divisível por 5, imprimir Fizz.
         c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.

     3. Escreva um programa capaz de receber um texto e imprimi-lo invertido.
     Entrada: Meu nome é Julius.                             Saída: .suiluJ é emon ueM

     4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
    retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
     “xxooox” -> true          “xxxxo” -> false          “bdefghjij” -> false           “ooooxzzzzz” -> false
*/

fun main() {
    var box = 0
    val limitBox = 2000
    val baloon = 7
    var totalBaloon = 0

    while (box < limitBox) {
        box += baloon

        totalBaloon++
    }

    println("Foram necessários $totalBaloon: $box")

    for (i in 1..50) {
        when {
            i % 3 == 0 -> println("Buzz")
            i % 5 == 0 -> println("Fizz")
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
        }
    }

    val str = "Meu nome é Julius."
    var inverted: String = ""

    for (i in 1..str.length) {
        inverted += str[str.length - i]
    }

    println(inverted)

    val s = "xxooox"
    var countX = 0
    var countO = 0

    for (i in 0 until s.length) {
        if (s[i] == 'x') {
            countX++
        }

        if (s[i] == 'o') {
            countO++
        }
    }

    println(countO == countX)
}








