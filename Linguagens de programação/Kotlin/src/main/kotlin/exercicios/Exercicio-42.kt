package exercicios

/*
    1. Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
    “1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”

    2. Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada:
       “50 49 48 47 .. .. .. 2 1”

    3. Usando a resolução do exercício 1, não imprima os números múltiplos de 5.

    4.
*/

fun main() {
    for (i in 1..50) {
        print("$i ")
    }

    println("\n---------------------------------------------------------------------------------------------")

    for (i in 50 downTo 1) {
        print("$i ")
    }

    println("\n---------------------------------------------------------------------------------------------")

    for (i in 1..50) {
        if (i % 5 == 0) continue

        print("$i ")
    }

    println("\n---------------------------------------------------------------------------------------------")

    var count = 0

    for (i in 1..500) {
        count++
    }

    println(count)

    println("\n---------------------------------------------------------------------------------------------")

    val total: Int = readln().toIntOrNull() ?: 0

    for (i in 1..total) {
        for (j in 1..i) {
            print("#")
        }

        println()
    }
}
