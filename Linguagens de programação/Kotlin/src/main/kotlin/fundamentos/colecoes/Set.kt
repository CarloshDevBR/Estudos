package fundamentos.colecoes

import java.util.Comparator

/*
    Set - Sets criam listas que não terão valores repetidos, se houver ele vai remover
*/

data class Person(val name: String, val age: Int, val salary: Double)

fun main() {
    // Set imutável
    val set = setOf(1, 2, 2, 3, 4, 5, 5)
    val setSliced = setOf(6, 7, 8, 9, 10)

    // Ordena os valores
    set.sorted()

    println(set)

    // Set mutável
    val mutableSet = mutableSetOf(1, 2, 3)

    mutableSet.add(4)
    mutableSet.add(4)
    mutableSet.add(5)
    mutableSet.addAll(setSliced)
    mutableSet.removeIf { it > 5 }

    println(mutableSet)

    // ------------------------------------------------------------------------------------------- //
    // Diferente do setOf, o hashSetOf ordena os valores
    val hashSet = hashSetOf(1, 3, 4, 2, 2, 5)

    println(hashSet)

    // ------------------------------------------------------------------------------------------- //
    /*
        Cria uma lista ordenada. Comparator.reverseOrder irá ordenar de forma decrescente,
        o utilitário Comparator só pode ser utilizado em sortedMapOf
    */
    val sortedSet = sortedSetOf(Comparator.reverseOrder(), 1, 3, 5, 2, 6, 7, 4, 5, 9, 9, 10, 8)

    println(sortedSet)

    // Ordenando objetos (para comparar em ordem crescente pode usar o compareBy)
    val salaryDescendingComparator = compareByDescending<Person> { it.salary }

    // Necessário passar como primeiro parametro para o kotlin entender
    val sortedSetPerson = sortedSetOf(
        salaryDescendingComparator,
        Person("Alice", 30, 50000.0),
        Person("Bob", 25, 45000.0),
        Person("Charlie", 35, 60000.0),
        Person("David", 28, 48000.0),
        Person("Eve", 40, 70000.0)
    )

    println(sortedSetPerson)
}