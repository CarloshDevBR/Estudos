package firstSteps

/*
    Unit - Representa a ausência de valor (similar ao void)
*/

fun main() {
    val unitValue: Unit = println("Hello, Kotlin!") // Unit pode ser um tipo atribuído
    println(unitValue) // Saída: kotlin.Unit

    // Unit é frequentemente usado em lambdas onde o valor de retorno não é necessário
    val printLambda: (message: String) -> Unit = { message -> println(message) }
    printLambda("Hello, Lambda!")

    printMessage()
}

fun printMessage(): Unit {
    println("Hello world!")
}