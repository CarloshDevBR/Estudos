package fundamentos.operators/*
    && = e
    || = ou
    ! = diferente
*/

fun main() {
    val n1 = 200
    val n2 = 201

    if (n1 <= 200 && n2 >= 200) {
        println("$n1 e $n2")
    }

    if (n1 > 100 || n2 > 200) {
        println("$n1 e $n2")
    }

    if (n1 != n2) {
        println("diferente")
    }
}