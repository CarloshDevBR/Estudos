package firstSteps

fun main() {
    val listPurchases = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana" , "Carne", "Leite")

    var index = 0

    // Valida e assim executa
    while (index <= listPurchases.size - 1) {
        println(listPurchases[index])

        ++index
    }

    // Executa primeiro e depois valida
    do {
        println(listPurchases[index])

        ++index
    } while (index <= listPurchases.size - 1)

    for (index  in 0..listPurchases.size - 1) {
        println(listPurchases[index])
    }

    for (fruit in 0 until listPurchases.size) {
        println(listPurchases[fruit])
    }

    // Esse código faz com que o for inicie no 10 e pule de 2 em 2 até o 0
    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    // Esse código faz com que o for inicie no 10 e pule de 3 em 3 até o 100
    for (i in 10 until 100 step 3) {
        println(i)
    }
}