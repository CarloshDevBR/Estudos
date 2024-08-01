package fundamentos.colecoes

/*
    Arrays - são uma coleção do tipo fixed-size (tamanho fixo)
    O tamanho deve ser determinado no momento da criacão
    Também deve ser do tipo SAMETYPE (um tipo único), array de inteiros, booleanos, objetos e etc..
    Não é possível remover um elemento de um array. Mas os valores dentro de um array
    podem ser alterados, mas seus indexes permanecerão na memória
*/

fun main() {
    // Matriz (mutável)
    var listPurchases = arrayOf<Any?>("Arroz", "Feijão", "Batata", "Uva", "Banana" , "Carne", "Leite")

    // Alterando um valor do array
    listPurchases[6] = null

    // Buscando por index
    println(listPurchases[6])
    println(listPurchases[2])

    // Adicionando Ovos (por de baixo dos panos se cria um novo array e adiciona os elementos)
    listPurchases += "Ovos"

    createArrayOfNulls()

    createEmptyArray()

    createArrayConstructor()
}

fun createArrayOfNulls() {
    val nullArray: Array<Int?> = arrayOfNulls(5)

    println(nullArray.joinToString()) // null, null, null, null, null
}

fun createEmptyArray() {
    val emptyArray = emptyArray<Int>()

    println(emptyArray.contentToString()) // []
}

fun createArrayConstructor() {
    val array = Array(5) { "" }

    println(array.joinToString()) // 0, 0, 0
}