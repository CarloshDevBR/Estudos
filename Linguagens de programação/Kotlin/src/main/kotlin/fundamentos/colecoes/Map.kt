package fundamentos.colecoes

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

    // ------------------------------------------------------------------------------------------- //
    // Criando mutableMap (só é possível converter)
    val mutabMap = map.toMutableMap()

    mutabMap[4] =  Worker("Silva", 2800.0, "Programmer")

    println(mutabMap)
}