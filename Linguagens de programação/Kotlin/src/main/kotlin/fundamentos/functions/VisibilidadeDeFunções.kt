package fundamentos.functions

// Funções top level (Funções que ficam em um único arquivo)
fun main() {
    // Função privada (pode se criar uma função com o mesmo nome nesse mesmo arquivo)
    // sayHello()
    // Função visível para ser utilizada por outros arquivos
    sayMyName("Carlos")
    println("FIM!")
}

// public é redundante pois todas funções top level sao públicas
public fun publicFunction() {
    println("função pública")
}