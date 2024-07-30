package exercicios

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val f = generator(0, 10)

    repeat(10) {
        print("${f()} ")
    }
}

fun generator(min: Int, max: Int): () -> Int {
    return { Random.nextInt(min..max) }
}