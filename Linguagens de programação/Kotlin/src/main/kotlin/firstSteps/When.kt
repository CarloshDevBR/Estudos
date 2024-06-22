package firstSteps

fun main() {
    val opcao = 3

    // Forma tradicional
    when (opcao) {
        1 -> println("Suco de laranja")
        2 -> println("Suco de uva")
        3 -> println("Suco de morango")
        else -> println("Nenhuma opção selecionada")
    }

    // Jogando o valor em uma variável na memória
    var mensagem = when (opcao) {
        1 -> println("Suco de laranja")
        2 -> println("Suco de uva")
        3 -> println("Suco de morango")
        else -> println("Nenhuma opção selecionada")
    }

    println(mensagem)

    // Criando várias validações no mesmo case
    when (opcao) {
        0,2,3,4 -> println("Entrou no range")
    }

    // Verificando tipos
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}

class MyClass
