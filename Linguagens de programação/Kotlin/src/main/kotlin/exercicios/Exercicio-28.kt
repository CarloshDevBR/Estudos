package exercicios

fun main() {
    val f1 = printValue { "Carlos H" }

    f1()
}

fun printValue(value: () -> String): () -> Unit {
    return {
        println("***********")
        print(value())
        println("\n***********")
    }
}