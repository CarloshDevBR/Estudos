package fundamentos.colecoes

/*
    List - diferente de Arrays,
    as listas são imutáveis e não podem ter seu valor alterado.

    MutableListOf - cria uma lista mutável onde é possível adicionar e remover elementos
*/

fun main() {
    // List imutável

    val list = listOf(1, 2, 3, 4, 5)

    // Iterando uma lista imutável
    list.forEach { println(it) }

    // Cria uma lista vazia
    val emptyList = emptyList<Int>()

    /// Cria uma lista que removerá os nulls
    val listOfNotNull = listOfNotNull(1, null, 3, 4, null)

    // ------------------------------------------------------------------- //
    // Lista mutável

    val mutableList = mutableListOf(1, 2, 3)

    // Adicionando valores
    mutableList.add(4)
    mutableList.add(5)

    // Removendo valores
    mutableList.remove(3)

    println(mutableList)

    // ------------------------------------------------------------------- //
    // Convertendo listas

    val list2 = listOf("A", "B", "C", "C")

    // Converteu para mutableList
    val mutabList2 = list2.toMutableList()

    // Converteu para set
    val set = mutabList2.toSet()

    // Converteu para mutableSet
    val setMult = set.toMutableSet()

    // Converteu para sortedSet
    val sortedSet = setMult.toSortedSet()
}







