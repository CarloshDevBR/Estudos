package exercicios

import kotlin.random.Random

fun main() {
    val secret = Random.nextInt(0, 101)
    var playing = true
    var n = 0

    while (playing) {
        println("> ")
        n = readln().toInt()

        when {
            n > secret -> println("O número sorteado é menor")
            n < secret -> println("O número sorteado é maior")
            else -> playing = false
        }
    }

    println("Parabéns! Você acertou o número, que era $n")
}