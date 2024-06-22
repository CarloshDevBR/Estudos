package exercicios

fun main() {
    println("> ")

    val n = readln().toInt()

    var i = 1
    val m = 10

    while (i <= m) {
        println("$n x $i = ${n * i}")

        i++
    }

    for (i in 0 .. m) {
        println("$n + $i = ${n + i}")
    }
}