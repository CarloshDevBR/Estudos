package fundamentos.colecoes

import java.util.Comparator

/*
    Map - É uma coleção que trabalha com chaves e valores
*/

fun main() {
    // Método antigo de criar
    val oldMap = mapOf(
        Pair(1, "A"),
        Pair(2, "B"),
        Pair(3, "C")
    )

    // Método mais atual de criar
    val map = mapOf(
        1 to Worker("Carlos", 2800.0, "Programmer"),
        2 to Worker("Carlos", 2800.0, "Programmer"),
        3 to Worker("Carlos", 2800.0, "Programmer")
    )

    // Acessando valores
    println(map[2])

    // Iterando o Map (no Map o it tem dois valores)
    oldMap.forEach { (k, v) -> println("key=$k and valu=$v") }

    oldMap.keys.forEach { println(it) }

    oldMap.values.forEach { println(it) }

    // ------------------------------------------------------------------------------------------- //
    // Criando mutableMap (só é possível converter)
    val mutabMap = map.toMutableMap()

    mutabMap[4] =  Worker("Silva", 2800.0, "Programmer")

    println(mutabMap)

    // ------------------------------------------------------------------------------------------- //
    // Ordenando valores em sortedMapOf (o utilitário Comparator só pode ser utilizado em sortedMapOf)
    val hashMap = sortedMapOf(
        Comparator.reverseOrder(),
        55 to "Brasil",
        351 to "Portugal",
        54 to "Argentina",
        1 to "United States"
    )

    println(hashMap)
}