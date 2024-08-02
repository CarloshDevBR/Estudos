package fundamentos.functions

// Importando uma extensão de função
import fundamentos.functions.ext.hide

/*
    Extension Function - permite adicionar novas implementações
*/

fun main() {
    val l = listOf(1, 2, 3, 4, 5).sumEvenNumbers()

    println(l)

    println("Carlos Henrique".hide())
}

// Extension Function
fun List<Int>.sumEvenNumbers(): Int {
    // this vai referenciar a lista
    return this.filter { it % 2 == 0 }.sum()
}
