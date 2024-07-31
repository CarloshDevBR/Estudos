package fundamentos.colecoes

/*
    Arrays - são uma coleção do tipo fixed-size (tamanho fixo)
    O tamanho deve ser determinado no momento da criacão
    Também deve ser do tipo SAMETYPE (um tipo único), array de inteiros, booleanos, objetos e etc..
    Não é possível remover um elemento de um array
*/

fun main() {
    // Matriz
    var listPurchases = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana" , "Carne", "Leite")

    // Buscando por index
    println(listPurchases[6])
    println(listPurchases[2])

    // Adicionando Ovos
    listPurchases += "Ovos"

    // Converte uma matriz em uma única String.
    println(listPurchases.joinToString()) // Saída: Arroz, Feijão, Batata, Uva, Banana, Carne, Leite, Ovos

    // Retorna uma representação de String de uma matriz
    println(listPurchases.contentToString()) // // Saída: [Arroz, Feijão, Batata, Uva, Banana, Carne, Leite, Ovos]

    // Capturando o tamanho do array
    println(listPurchases.size)

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