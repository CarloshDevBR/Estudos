package firstSteps

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
    val array = Array<Int>(3) { 0 }

    println(array.joinToString()) // 0, 0, 0
}