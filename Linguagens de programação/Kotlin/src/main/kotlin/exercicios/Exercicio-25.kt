package exercicios

fun main() {
    val f = { n: Int ->
        val d = n * 2
        println(d)
        d
    }

    f(2)
    f(20)
}